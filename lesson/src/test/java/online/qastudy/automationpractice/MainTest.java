package online.qastudy.automationpractice;

import online.qastudy.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static online.qastudy.automationpractice.WebElements.homeButton;
import static online.qastudy.automationpractice.WebElements.subscribeButton;

public class MainTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Установка пути к драйверу браузера (в данном случае Chrome)
        System.setProperty("webdriver.chrome.driver", "C:\\TOOLS\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
    }

    @Test
    public void testElementPresence() {
        // Ищем элемент на странице
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement homeButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-home']")));
        WebElement productsButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='material-icons card_travel']")));
        WebElement cartButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']//*[@href='/view_cart']")));
        WebElement loginButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='/login']")));
        WebElement testcasesButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='/test_cases']//*[@class='fa fa-list']")));
        WebElement apilistButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='/api_list']//*[@class='fa fa-list']")));
        WebElement videotutorialsButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-youtube-play']")));
        WebElement contactusButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-envelope']")));
        WebElement testcasescaruselButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='/test_cases']//*[@class='btn btn-success']")));
        WebElement apilistcaruselButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='/api_list']//*[@class='btn btn-success']")));
        WebElement categorywomenButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-toggle='collapse'][@href='#Women']")));
        WebElement categorymenButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-toggle='collapse'][@href='#Men']")));
        WebElement categorykidsButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-toggle='collapse'][@href='#Kids']")));

        // Проверка, что элемент есть на странице
        Assert.assertNotNull(homeButton, "Элемент не найден на странице");
        Assert.assertNotNull(productsButton, "Элемент не найден на странице");
        Assert.assertNotNull(cartButton, "Элемент не найден на странице");
        Assert.assertNotNull(loginButton, "Элемент не найден на странице");
        Assert.assertNotNull(testcasesButton, "Элемент не найден на странице");
        Assert.assertNotNull(apilistButton, "Элемент не найден на странице");
        Assert.assertNotNull(videotutorialsButton, "Элемент не найден на странице");
        Assert.assertNotNull(contactusButton, "Элемент не найден на странице");
        Assert.assertNotNull(testcasescaruselButton, "Элемент не найден на странице");
        Assert.assertNotNull(apilistcaruselButton, "Элемент не найден на странице");
        Assert.assertNotNull(categorywomenButton, "Элемент не найден на странице");
        Assert.assertNotNull(categorymenButton, "Элемент не найден на странице");
        Assert.assertNotNull(categorykidsButton, "Элемент не найден на странице");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
