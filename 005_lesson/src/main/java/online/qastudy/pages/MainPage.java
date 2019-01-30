package online.qastudy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private static final String MAIN_PAGE_URL ="http://automationpractice.com";

    private WebDriver driver;
    By tshirtsTab = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openMainPage(){
        driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public MainPage openTShirtTab(){
        driver.findElement(tshirtsTab).click();
        return this;
    }
}
