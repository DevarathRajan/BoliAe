package android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {public AndroidDriver driver;
    private static final String APPIUM_SERVER = "http://127.0.0.1:4723/";

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("appium:automationName", "UiAutomator2");
        dc.setCapability("appium:app", System.getProperty("user.dir") + "/apps/base.apk");

        driver = new AndroidDriver(new URL(APPIUM_SERVER), dc);
    }
    @AfterTest
    public void exit(){
        driver.quit();
    }
}
