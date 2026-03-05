package base;

import driver.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AndroidBaseTest {
    protected AndroidDriver driver;
    protected AppiumDriverLocalService service;

    @BeforeClass
    public void startAppium(){
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }
    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.setAndroidDriver(service);
    }

    @AfterClass
    public void stopEverything(){
        if (driver != null) driver.quit();
        if (service != null) service.stop();
    }
}
