package tests;

import base.AndroidBaseTest;
import org.testng.annotations.Test;
import pages.HomeScreen;

public class TestHomeScreen extends AndroidBaseTest {
    HomeScreen homeScreen;

    @Test
    public void HomeScreenTest() {
        homeScreen = new HomeScreen(driver);
        homeScreen.setMyAccountTab();
    }
}
