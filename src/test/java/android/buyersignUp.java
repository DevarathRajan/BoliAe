package android;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.scrollUtil;
import java.time.Duration;
import java.util.Map;

public  class buyersignUp extends android.BaseTest {

    @Test
    public void Login() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sign Up\")"))).click();

        boolean isRegistrationDis = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"Registration\")"))).isDisplayed();
        Assert.assertTrue(isRegistrationDis, "Registration is visble");

        if (isRegistrationDis) {
            WebElement buyer = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Buyer\")"));
            buyer.click();

            //Regsitration details

            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"ion-input-0\")")).sendKeys("Devarath");
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"ion-input-1\")")).sendKeys("Rajan");
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"ion-input-2\")")).sendKeys("bolitesting@yopmail.com");
            driver.findElement(AppiumBy.className("android.widget.Button")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(6)"))).sendKeys("United Arab Emirates");

            wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().text(\"(+971 ) United Arab Emirates\")"))).click();
//Input phone number issue
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"ion-input-3\")"))).click();
//            phone.sendKeys("128132870");

            driver.executeScript("mobile: shell", Map.of("command", "input text 128132870"));


            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"ion-input-4\")"))).sendKeys("Abc123@");

            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"ion-input-5\")"))).sendKeys("Abc123@");

            WebElement cb = driver.findElement(AppiumBy.className("android.widget.CheckBox"));
            cb.click();
//            Assert.assertTrue(cb.isSelected(),"Checkbox not ticked");
            scrollUtil scroll = new scrollUtil(driver);
            scroll.scrollToText("Sign Up").click();
        } else {
            System.out.println("Registration page error");
        }
    }}
