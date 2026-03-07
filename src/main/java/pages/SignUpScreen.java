package pages;

import actions.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SignUpScreen extends BasePage {

    AndroidActions androidActions;

    @AndroidFindBy(accessibility = "إنشاء حساب جديد ")
    private WebElement signUpHeader;

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

    public SignUpScreen setFirstNameField(String text) {
        click(firstNameField);
        sendKeys(firstNameField, text);
        return this;
    }

    public SignUpScreen setMobileNumberField(String number) {
        click(mobileNumberField);
        sendKeys(mobileNumberField, number);
        return this;
    }

    public SignUpScreen setEmailField(String email) {
        click(emailField);
        sendKeys(emailField, email);
        return this;
    }

    public SignUpScreen setCityDropDown() {
        click(cityDropDown);
        click(cityOption);
        return this;
    }

    public SignUpScreen setPasswordField(String password) {
        click(passwordField);
        sendKeys(passwordField, password);
        return this;
    }

    public SignUpScreen setConfirmPasswordField(String confirmPassword) {
        click(confirmPasswordField);
        sendKeys(confirmPasswordField, confirmPassword);
        return this;
    }

    public HomeScreen setCreateAccountButton(String text) {
        androidActions.scrollToText(text);
        waitForClickability(createAccountButton);
        click(createAccountButton);
        return new HomeScreen(driver);
    }

    public SignUpScreen setValidationErrors() {
        waitForVisibility(validationErrors);
        isDisplayed(validationErrors);
        System.out.println("Validation errors are displayed: " + validationErrors.isDisplayed());
        return this;
    }

    public Boolean isSignUpScreenDisplayed() {
        if (signUpHeader.isDisplayed()) {
            System.out.println("Sign Up Screen is displayed");
        } else {
            System.out.println("Sign Up Screen is not displayed");
        }
        return signUpHeader.isDisplayed();
    }

}
