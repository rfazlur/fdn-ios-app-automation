package screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BaseAction {
    AppiumDriver appiumDriver;

    public BaseAction(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(1)), this);
    }

    protected boolean isElementPresent(final WebElement mobileElement, Duration timeOutSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(appiumDriver, timeOutSeconds);
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected void tapOnElement(WebElement element) {
        boolean statusElement = isElementPresent(element, Duration.ofSeconds(3));
        if (statusElement) {
            element.click();
        } else {
            Assert.fail("Element not found");
        }
    }

    protected void inputTextIntoField(WebElement element, String text) {
        boolean statusElement = isElementPresent(element, Duration.ofSeconds(3));
        if (statusElement) {
            element.sendKeys(text);
        } else {
            Assert.fail("Element not found");
        }
    }
}
