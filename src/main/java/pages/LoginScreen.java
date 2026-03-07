package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BasePage {

    @AndroidFindBy(accessibility = "إنشاء حساب جديد ")
    private WebElement createNewAccountButton;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public SignUpScreen setCreateNewAccountButton() {
        click(createNewAccountButton);
        return new SignUpScreen(driver);
    }

    public Boolean isLoginScreenDisplayed() {
        if (createNewAccountButton.isDisplayed()) {
            System.out.println("Login Screen is displayed");
        } else {
            System.out.println("Login Screen is not displayed");
        }
        return createNewAccountButton.isDisplayed();
    }
}
