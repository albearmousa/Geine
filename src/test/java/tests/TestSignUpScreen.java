package tests;

import base.AndroidBaseTest;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.LoginScreen;
import pages.SignUpScreen;

public class TestSignUpScreen extends AndroidBaseTest {
    SignUpScreen signUpScreen;

    @Test
    public void SignUpWithInvalidData() throws InterruptedException {
        HomeScreen homeScreen = new HomeScreen(driver);
        homeScreen.setMyAccountTab();
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.setCreateNewAccountButton();
        signUpScreen = new SignUpScreen(driver);
        signUpScreen.setFirstNameField("Albear Mousa");
        signUpScreen.setMobileNumberField("01220898249");
        signUpScreen.setEmailField("albearmosa@gmail.com");
        signUpScreen.setCityDropDown();
        signUpScreen.setPasswordField("Admin@123");
        signUpScreen.setConfirmPasswordField("Admin@123");
        signUpScreen.setCreateAccountButton("إنشاء حساب");
        signUpScreen.setValidationErrors();
        Thread.sleep(3000);
    }
}
