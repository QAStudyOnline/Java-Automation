package online.qastudy.automationpractice;

import online.qastudy.pages.MainPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEDRIVER"));

        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        this.mainPage = new MainPage(this.driver);

    }

    @Test
    public void canSelectSizeLForTShirt() {
        Assert.assertTrue(
                mainPage.openMainPage()
                        .openTShirtTab()
                        .selectSizeL()
                        .isSizeL());

    }

    @After
    public void cleanup(){
//        this.driver.close();
      driver.quit();
    }
}
