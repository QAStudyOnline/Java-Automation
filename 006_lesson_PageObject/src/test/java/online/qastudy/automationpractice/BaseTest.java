package online.qastudy.automationpractice;

import online.qastudy.utils.Config;
import online.qastudy.utils.TestHelper;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public WebDriver driver;
    private final Properties config = Config.loadProperties("test.properties");

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }


    @After
    public void cleanup(){
        driver.manage().deleteAllCookies();
        TestHelper.sleep5Seconds();
        driver.close();
    }
}
