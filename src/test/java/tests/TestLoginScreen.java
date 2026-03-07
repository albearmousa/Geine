package tests;

import base.AndroidBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.LoginScreen;
import pages.SignUpScreen;

public class TestLoginScreen extends AndroidBaseTest {

    // ✅ Test 1 — focused on Login screen only
    @Test
    public void userCanOpenLoginScreenFromHome() {
        LoginScreen loginScreen = new HomeScreen(driver).setMyAccountTab();
        Assert.assertTrue(loginScreen.isLoginScreenDisplayed(),
                "Login screen should be displayed after tapping My Account");
    }

    // ✅ Test 2 — focused on navigating to SignUp
    @Test
    public void userCanNavigateToSignUpFromLoginScreen() {
        SignUpScreen signUpScreen = new HomeScreen(driver)
                .setMyAccountTab()
                .setCreateNewAccountButton();
        Assert.assertTrue(signUpScreen.isSignUpScreenDisplayed(),
                "Sign Up screen should be displayed after tapping Create New Account");
    }
}
