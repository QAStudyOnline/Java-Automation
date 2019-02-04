package online.qastudy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;

    private By tshirtsTab = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    private By sizeLcheckbox = By.id("layered_id_attribute_group_3");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public MainPage openTShirtTab(){
        this.driver.findElement(tshirtsTab).click();
        return this;
    }

    public MainPage selectSizeL(){
        this.driver.findElement(sizeLcheckbox).click();
        return this;
    }

    public boolean isSizeL(){
        return this.driver.findElement(sizeLcheckbox).isSelected();
    }
}
