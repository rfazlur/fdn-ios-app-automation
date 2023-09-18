package hook;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.AppiumServer;

import java.io.IOException;

import static utils.DriverInitializer.setIOSDriver;

public class TestSetup {
    AppiumDriver appiumDriver;

    @Before
    public void setUp() throws IOException {
        AppiumServer.startServer();
        appiumDriver = setIOSDriver();
    }

    @After
    public void tearDown() {
        AppiumServer.stopServer();
    }
}
