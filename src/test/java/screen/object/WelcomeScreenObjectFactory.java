package screen.object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import screen.BaseAction;

public class WelcomeScreenObjectFactory extends BaseAction {
    public WelcomeScreenObjectFactory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='OK']") protected WebElement btnOKBannerMPC;
    @iOSXCUITFindBy(id = "btnLogin") protected WebElement btnLogin;
}
