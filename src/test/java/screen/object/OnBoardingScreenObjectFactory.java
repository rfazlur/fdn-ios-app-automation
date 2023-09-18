package screen.object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import screen.BaseAction;

public class OnBoardingScreenObjectFactory extends BaseAction {
    public OnBoardingScreenObjectFactory(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @iOSXCUITFindBy(id = "btnNext") protected WebElement btnNextId;
    @iOSXCUITFindBy(id = "btnGetStarted") protected WebElement btnGetStartedId;
}
