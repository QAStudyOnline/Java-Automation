package online.qastudy.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import online.qastudy.utils.Config;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public WebDriver driver;
    private final Properties config = Config.loadProperties("test.properties");

    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setup(@Optional("chrome") String browser) {
        if (browser.toLowerCase().equals("chrome")) {
            WebDriverManager
                    .chromedriver()
                    .version(config.getProperty("chromedriver.version"))
                    .setup();
            driver = new ChromeDriver();
        } else if (browser.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }


    @AfterMethod(alwaysRun = true)
    public void closeDown(ITestResult testResult) throws IOException {
        driver.manage().deleteAllCookies();
        if (testResult.getStatus() == ITestResult.FAILURE) {
            getScreenshot();
        }
        driver.close();
    }

    @Attachment(value = "screenshot", type = "image/png")
    public void getScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).
                getScreenshotAs(OutputType.FILE);
        String path = "./target/screenshots/" + screenshot.getName();
        FileUtils.copyFile(screenshot, new File(path));
    }
}
