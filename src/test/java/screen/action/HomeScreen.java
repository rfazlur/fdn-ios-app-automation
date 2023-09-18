package screen.action;

import io.appium.java_client.AppiumDriver;
import screen.object.HomeScreenObjectFactory;

import java.time.Duration;

public class HomeScreen extends HomeScreenObjectFactory {
    public HomeScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void tapCloseButtonBanner() {
        tapOnElement(btnCloseBanner);
    }

    public void tapLoginButton() {
        tapOnElement(btnLoginId);
    }

    public void tapCloseButtonCompleteProfile() {
        tapOnElement(btnClose);
    }

    public void tapRemindLatterRateApp() {
        tapOnElement(btnRemindLatter);
    }

    public void validateProfilePictureElement() {
        isElementPresent(placeholderProfile, Duration.ofSeconds(3));
    }
}
