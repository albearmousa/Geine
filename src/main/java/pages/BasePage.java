package pages;

import actions.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

import java.time.Duration;

public class BasePage {
    AndroidDriver driver;
    WaitUtils waitUtils;
    AndroidActions androidActions;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

    }
 /* =============================
           COMMON WAIT METHODS
    ============================== */

    protected void waitForVisibility(WebElement element) {
        waitUtils.waitForElementVisible(element);
    }

    protected void waitForClickability(WebElement element) {
        waitUtils.waitForElementClickable(element);
    }

     /* =============================
           COMMON ACTION METHODS
    ============================== */

    protected void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    protected void sendKeys(WebElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }

    protected String getText(WebElement element) {
        waitForVisibility(element);
        return element.getText();
    }

    protected boolean isDisplayed(WebElement element) {
        try {
            waitForVisibility(element);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}