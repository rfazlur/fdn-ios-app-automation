package screen.action;

import io.appium.java_client.AppiumDriver;
import screen.object.OnBoardingScreenObjectFactory;

public class OnBoardingScreen extends OnBoardingScreenObjectFactory {

    public OnBoardingScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void tapNextButton() {
        tapOnElement(btnNextId);
    }

    public void tapButtonGetStarted() {
        tapOnElement(btnGetStartedId);
    }
}
