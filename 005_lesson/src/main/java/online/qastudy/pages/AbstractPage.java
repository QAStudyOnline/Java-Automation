package online.qastudy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver=driver;
    }

    public void openPage(String url){
        driver.navigate().to(url);
    }

    public void clickOnElement(By element){
        driver.findElement(element).click();
    }

    public void typeInTextField(By locator, String text){
        WebElement field = driver.findElement(locator);
        field.clear();
        field.sendKeys(text);
    }
}
