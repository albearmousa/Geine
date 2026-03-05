package driver;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utils.ConfigReader;

public class DriverFactory {

    public static AndroidDriver setAndroidDriver (AppiumDriverLocalService service){
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platformName"));
        options.setDeviceName(ConfigReader.getProperty("deviceName"));
        options.setAutomationName(ConfigReader.getProperty("automationName"));
        options.setPlatformVersion(ConfigReader.getProperty("platformVersion"));
        options.setApp(ConfigReader.getProperty("app"));
        options.setAutoGrantPermissions(true);
        return new AndroidDriver(service.getUrl(), options);
    }
}
