package screen.object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import screen.BaseAction;

public class KeyboardScreenObjectFactory extends BaseAction {
    public KeyboardScreenObjectFactory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @iOSXCUITFindBy(id = "Done") protected WebElement btnDone;
}
