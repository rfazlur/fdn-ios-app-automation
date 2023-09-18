package utils;

import data.PropertiesDataHandler;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.io.IOException;


public class AppiumServer {
    private static final Runtime runtime = Runtime.getRuntime();
    protected static AppiumDriverLocalService service;

    public static void startServer() throws IOException {
        String node = new PropertiesDataHandler().getPropsValue("NODE_LOCATION");
        String appium = new PropertiesDataHandler().getPropsValue("APPIUM_LOCATION");
        File nodeLocation = new File(node);
        File appiumLocation = new File(appium);
        String appiumURL = new PropertiesDataHandler().getPropsValue("APPIUM_HOST");
        int appiumPort = Integer.parseInt(new PropertiesDataHandler().getPropsValue("APPIUM_PORT"));

        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder
                .withAppiumJS(appiumLocation)
                .usingDriverExecutable(nodeLocation)
                .usingPort(appiumPort)
                .withIPAddress(appiumURL);

        service = AppiumDriverLocalService.buildService(builder);
        service.start();
    }

    public static void stopServer() {
        if (service != null) {
            try {
                runtime.exec("killall node");
                if (service == null) {
                    System.out.println("Appium Server Stopped...");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
