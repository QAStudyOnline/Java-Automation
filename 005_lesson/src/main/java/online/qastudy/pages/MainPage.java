package online.qastudy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage {

    private static final String MAIN_PAGE_URL = "http://automationpractice.com";

    private By tshirtsTab = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    private By sizeLcheckbox = By.id("layered_id_attribute_group_3");
    private By searchField = By.id("searchbox");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openMainPage() {
        openPage(MAIN_PAGE_URL);
        return this;
    }

    public MainPage openTShirtTab() {
        clickOnElement(tshirtsTab);
        return this;
    }

    public MainPage selectSizeL() {
        this.driver.findElement(sizeLcheckbox).click();
        return this;
    }

    public boolean isSizeL() {
        return this.driver.findElement(sizeLcheckbox).isSelected();
    }

    public MainPage searchForItem(String itemName) {
        typeInTextField(searchField, itemName);
        return this;
    }
}
