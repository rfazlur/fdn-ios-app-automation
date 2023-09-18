package hook;

import io.appium.java_client.AppiumDriver;
import screen.action.*;

public class FemaleDaily {
    protected AppiumDriver appiumDriver;

    public FemaleDaily(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public OnBoardingScreen onBoardingScreen() {
        return new OnBoardingScreen(appiumDriver);
    }

    public HomeScreen homeScreen() {
        return new HomeScreen(appiumDriver);
    }

    public WelcomeScreen welcomeScreen() {
        return new WelcomeScreen(appiumDriver);
    }

    public LoginFormScreen loginFormScreen() {
        return new LoginFormScreen(appiumDriver);
    }

    public KeyboardScreen keyboardScreen() {
        return new KeyboardScreen(appiumDriver);
    }
}
