package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends BasePage {

    @AndroidFindBy(accessibility = "إنشاء حساب جديد ")
    private WebElement createNewAccountButton;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public SignUpScreen setCreateNewAccountButton() {
        click(createNewAccountButton);
        return new SignUpScreen(driver);
    }
}
