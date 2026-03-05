package actions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import pages.BasePage;

import java.time.Duration;
import java.util.Collections;

public class AndroidActions extends BasePage {
    protected AndroidDriver driver;

    public AndroidActions(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void tapByCoordinates(int x, int y) {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence tap = new Sequence(finger, 1);

        tap.addAction(
                finger.createPointerMove(
                        Duration.ZERO,
                        PointerInput.Origin.viewport(),
                        x,
                        y
                )
        );

        tap.addAction(
                finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())
        );

        tap.addAction(
                finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())
        );

        driver.perform(Collections.singletonList(tap));
    }

    public void scrollToText(String text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().description(\"" + text + "\"));"
        ));
    }

}
