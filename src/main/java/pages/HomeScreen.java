package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BasePage {

    @AndroidFindBy(accessibility = "حسابي")
    private WebElement myAccountTab;

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public LoginScreen setMyAccountTab() {
        click(myAccountTab);
        return new LoginScreen(driver);
    }

    public Boolean isHomeScreenDisplayed() {
        if (myAccountTab.isDisplayed()) {
            System.out.println("Home screen is displayed");
        } else {
            System.out.println("Home screen is not displayed");
        }
        return myAccountTab.isDisplayed();
    }
}