package example;

import data.PropertiesDataHandler;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {
    @Test
    void getAppiumAndNodeLocation() {
        Process process;
        Runtime runtime = Runtime.getRuntime();
        String nodeLocation = getEnvLocation("which node");
        String appiumLocation = getEnvLocation("which appium");
        try {
            process = runtime.exec(nodeLocation +" "+appiumLocation);
            if (process != null) {
                System.out.println("Appium Server Started !");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getPropertiesKey() throws IOException {
        String appiumURL = new PropertiesDataHandler().getPropsValue("APPIUM_HOST");
        String appiumPort = new PropertiesDataHandler().getPropsValue("APPIUM_PORT");
        System.out.println(appiumPort);
        System.out.println(appiumURL);
    }

    private String getEnvLocation(String command) {
        StringBuilder output = new StringBuilder();
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output.toString();
    }
}
