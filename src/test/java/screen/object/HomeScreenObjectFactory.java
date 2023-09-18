package screen.object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import screen.BaseAction;

public class HomeScreenObjectFactory extends BaseAction {

    public HomeScreenObjectFactory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @iOSXCUITFindBy(id = "ic close") protected WebElement btnCloseBanner;
    @iOSXCUITFindBy(id = "Login") protected WebElement btnLoginId;
    @iOSXCUITFindBy(id = "btnClose") protected WebElement btnClose;
    @iOSXCUITFindBy(id = "btnRemindLatter") protected WebElement btnRemindLatter;
    @iOSXCUITFindBy(id = "placeholder_profile_small") protected WebElement placeholderProfile;
}
