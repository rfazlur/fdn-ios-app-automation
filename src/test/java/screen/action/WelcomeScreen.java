package screen.action;

import io.appium.java_client.AppiumDriver;
import screen.object.WelcomeScreenObjectFactory;

public class WelcomeScreen extends WelcomeScreenObjectFactory {
    public WelcomeScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void tapOKButtonMPC() {
        tapOnElement(btnOKBannerMPC);
    }

    public void tapLoginButton() {
        tapOnElement(btnLogin);
    }
}
