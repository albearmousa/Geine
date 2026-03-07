package tests;

import base.AndroidBaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.SignUpScreen;

public class TestSignUpScreen extends AndroidBaseTest {

    @Test(dataProvider = "invalidRegisterData")
    public void signUpFormShowsValidationErrorsOnSubmit(String name, String mobile, String email, String password, String confirmPassword, String createAccountButtonText) {

        SignUpScreen signUpScreen = new HomeScreen(driver).setMyAccountTab().setCreateNewAccountButton();

        Assert.assertTrue(signUpScreen.isSignUpScreenDisplayed());
        signUpScreen.setFirstNameField(name)
                .setMobileNumberField(mobile)
                .setEmailField(email)
                .setCityDropDown()
                .setPasswordField(password)
                .setConfirmPasswordField(confirmPassword)
                .setCreateAccountButton(createAccountButtonText);
        signUpScreen.setValidationErrors();
    }

    @Test(dataProvider = "ValidRegisterData")
    public void signUpFormWithValidData(String name, String mobile, String email, String password, String confirmPassword, String createAccountButtonText) {

        SignUpScreen signUpScreen = new HomeScreen(driver).setMyAccountTab().setCreateNewAccountButton();

        Assert.assertTrue(signUpScreen.isSignUpScreenDisplayed());
        signUpScreen.setFirstNameField(name)
                .setMobileNumberField(mobile)
                .setEmailField(email)
                .setCityDropDown()
                .setPasswordField(password)
                .setConfirmPasswordField(confirmPassword)
                .setCreateAccountButton(createAccountButtonText);
        HomeScreen homeScreen = new HomeScreen(driver);
        Assert.assertTrue(homeScreen.isHomeScreenDisplayed(),
                "Home screen should be displayed after successful registration");
    }

    @DataProvider(name = "invalidRegisterData")
    public Object[][] getInvalidRegisterData() {
        return new Object[][]{
                {"Albear Mousa", "01220898247", "albearmousa@gmail.com", "Admin@123", "Admin@123", "إنشاء حساب" }};
    }

    @DataProvider(name = "ValidRegisterData")
    public Object[][] getValidRegisterData() {
        return new Object[][]{
                {"Albear Mousa", "01220898211", "alb@gmail.com", "123456", "123456", "إنشاء حساب" }};
    }
}
