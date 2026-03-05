package pages;

import actions.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SignUpScreen extends BasePage {

    AndroidActions androidActions;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    private WebElement firstNameField;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    private WebElement mobileNumberField;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[3]")
    private WebElement emailField;

    @AndroidFindBy(accessibility = "مدينة بدر")
    private WebElement cityDropDown;

    @AndroidFindBy(accessibility = "مدينة الشروق")
    private WebElement cityOption;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[4]")
    private WebElement passwordField;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[5]")
    private WebElement confirmPasswordField;

    @AndroidFindBy(accessibility = "إنشاء حساب")
    private WebElement createAccountButton;

    @AndroidFindBy(accessibility = "Validation errors")
    private WebElement validationErrors;

    public SignUpScreen(AndroidDriver driver) {
        super(driver);
        androidActions = new AndroidActions(driver);
    }

    public void setFirstNameField(String text) {
        click(firstNameField);
        sendKeys(firstNameField, text);
    }

    public void setMobileNumberField(String number) {
        click(mobileNumberField);
        sendKeys(mobileNumberField, number);
    }

    public void setEmailField(String email) {
        click(emailField);
        sendKeys(emailField, email);
    }

    public void setCityDropDown() {
        click(cityDropDown);
        click(cityOption);

    }

    public void setPasswordField(String password) {
        click(passwordField);
        sendKeys(passwordField, password);
    }

    public void setConfirmPasswordField(String confirmPassword) {
        click(confirmPasswordField);
        sendKeys(confirmPasswordField, confirmPassword);
    }

    public void setCreateAccountButton(String text) throws InterruptedException {
        androidActions.scrollToText(text);
        waitForClickability(createAccountButton);
        click(createAccountButton);
    }

    public void setValidationErrors() {
        waitForVisibility(validationErrors);
        isDisplayed(validationErrors);
        System.out.println("Validation errors are displayed: " + validationErrors.isDisplayed());
    }
}
