package online.qastudy.automationpractice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import online.qastudy.utils.Config;
import online.qastudy.utils.TestHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public WebDriver driver;
    private final Properties config = Config.loadProperties("test.properties");

    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setup(@Optional("chrome") String browser) throws MalformedURLException {
        if (browser.toLowerCase().equals("chrome")) {
            WebDriverManager.chromedriver().version(config.getProperty("chrome.version")).setup();
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
        } else if (browser.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capabilities);
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }


    @AfterMethod
    public void cleanup() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            TestHelper.sleep5Seconds();
            driver.close();
        }
    }
}
