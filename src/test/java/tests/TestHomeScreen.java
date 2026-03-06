package tests;

import base.AndroidBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.LoginScreen;

public class TestHomeScreen extends AndroidBaseTest {
    HomeScreen homeScreen;

    @Test
    public void userCanOpenLoginScreenFromHome() {
        LoginScreen loginScreen = new HomeScreen(driver).setMyAccountTab();
        Assert.assertTrue(loginScreen.isLoginScreenDisplayed());
    }
}
