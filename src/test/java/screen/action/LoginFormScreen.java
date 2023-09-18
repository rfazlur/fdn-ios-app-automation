package screen.action;

import io.appium.java_client.AppiumDriver;
import screen.object.LoginFormScreenObjectFactory;

public class LoginFormScreen extends LoginFormScreenObjectFactory {
    public LoginFormScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void inputUsername(String username) {
        inputTextIntoField(txtAccount, username);
    }

    public void tapButtonNext() {
        tapOnElement(btnNext);
    }

    public void inputPassword(String password) {
        inputTextIntoField(txtPassword, password);
    }

    public void tapButtonLogin() {
        tapOnElement(btnLogin);
    }
}
