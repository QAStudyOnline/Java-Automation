package android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    private AndroidDriver<MobileElement> driver;
    private WebDriverWait wait;
    private By searchField = By.id("com.android.chrome:id/search_box_text");
    private By noThanksBtn = By.id("com.android.chrome:id/negative_button");
    private By acceptBtn = By.id("com.android.chrome:id/terms_accept");

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel_2_XL_API_30");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void firstTest() {
        driver.findElement(acceptBtn).click();
        driver.findElement(noThanksBtn).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        driver.findElement(searchField).sendKeys("Prog Kyiv Ua QA Automation");
        driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
    }

}
