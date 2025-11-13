package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class scrollUtil {
    AndroidDriver driver;

    public scrollUtil(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement scrollToText(String text) {
        return driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))" +
                                ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"
                )
        );
    }

    public WebElement scrollToDescription(String desc) {
        return driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))" +
                                ".scrollIntoView(new UiSelector().description(\"" + desc + "\"))"
                )
        );
    }
}
