package utils;

import data.PropertiesDataHandler;
import hook.FemaleDaily;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

public class DriverInitializer {
    protected static AppiumDriver appiumDriver;
    protected static FemaleDaily femaleDaily;

    public static AppiumDriver setIOSDriver() throws IOException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        String appiumURL = new PropertiesDataHandler().getPropsValue("APPIUM_HOST");
        String appiumPort = new PropertiesDataHandler().getPropsValue("APPIUM_PORT");
        String iosPlatformName = new PropertiesDataHandler().getPropsValue("IOS_PLATFORM_NAME");
        String iosAutomationName = new PropertiesDataHandler().getPropsValue("IOS_AUTOMATION_NAME");
        String iosDeviceName = new PropertiesDataHandler().getPropsValue("IOS_DEVICE_NAME");
        String iosPlatformVersion = new PropertiesDataHandler().getPropsValue("IOS_PLATFORM_VERSION");
        String iosAppPath = new PropertiesDataHandler().getPropsValue("IOS_APP_PATH");
        String appiumServerURL = "http://"+appiumURL+":"+appiumPort;

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, iosPlatformName);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, iosAutomationName);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, iosDeviceName);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, iosPlatformVersion);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, iosAppPath);
        desiredCapabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);

        appiumDriver = new IOSDriver(new URL(appiumServerURL), desiredCapabilities);
        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        femaleDaily = new FemaleDaily(appiumDriver);
        return appiumDriver;
    }
}
