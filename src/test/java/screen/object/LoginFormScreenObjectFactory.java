package screen.object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import screen.BaseAction;

public class LoginFormScreenObjectFactory extends BaseAction {
    public LoginFormScreenObjectFactory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @iOSXCUITFindBy(id = "txtAccount") protected WebElement txtAccount;
    @iOSXCUITFindBy(id = "btnNext") protected WebElement btnNext;
    @iOSXCUITFindBy(id = "txtPassword") protected WebElement txtPassword;
    @iOSXCUITFindBy(id = "btnLogin") protected WebElement btnLogin;
}
