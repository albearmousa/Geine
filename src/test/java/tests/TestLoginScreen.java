package tests;

import base.AndroidBaseTest;
import org.testng.annotations.Test;
import pages.LoginScreen;

public class TestLoginScreen extends AndroidBaseTest {
    LoginScreen loginScreen;

    @Test
    public void LoginScreenTest() {
        loginScreen.setCreateNewAccountButton();
    }
}
