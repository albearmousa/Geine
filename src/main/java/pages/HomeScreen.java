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
}