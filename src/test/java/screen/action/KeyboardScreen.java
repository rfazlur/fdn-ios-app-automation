package screen.action;

import io.appium.java_client.AppiumDriver;
import screen.object.KeyboardScreenObjectFactory;

public class KeyboardScreen extends KeyboardScreenObjectFactory {
    public KeyboardScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void tapButtonDone() {
        tapOnElement(btnDone);
    }
}
