package tests;

import base.AndroidBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.SignUpScreen;

public class TestSignUpScreen extends AndroidBaseTest {
    SignUpScreen signUpScreen;

    @Test
    public void SignUpWithInvalidData() {

        signUpScreen = new HomeScreen(driver).setMyAccountTab().setCreateNewAccountButton();

        Assert.assertTrue(signUpScreen.isSignUpScreenDisplayed());
        signUpScreen.setFirstNameField("Albear Mousa")
                .setMobileNumberField("01220898249")
                .setEmailField("albearmosa@gmail.com")
                .setCityDropDown()
                .setPasswordField("Admin@123")
                .setConfirmPasswordField("Admin@123")
                .setCreateAccountButton("إنشاء حساب")
                .setValidationErrors();
    }
}
