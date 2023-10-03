package online.qastudy.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        WebElement element = driver.findElement(By.xpath("//*[@class='fa fa-home']"));

        // Проверка, элемент есть на странице
            Assert.assertNotNull(element, "Элемент не найден на странице");
    }

    @AfterTest
    public void tearDown() {
        // Закрыть хром
        driver.quit();
    }
}

