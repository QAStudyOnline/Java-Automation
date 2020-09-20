package online.qastudy.pages.attributes;

import online.qastudy.pages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountAttribute {
    private WebDriver driver;


    private WebElement emailField;
    private WebElement createAccountBtn;

    public CreateAccountAttribute(WebDriver driver) {
        this.driver = driver;
    }

    public CreateAccountAttribute typeEmail(String email){
        emailField = waitOnElement("//*[@id='email_create']");
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage clickCreateAnAccount(){
        createAccountBtn = waitOnElement("//*[@id='SubmitCreate']");
        createAccountBtn.click();
        return new RegistrationPage(driver);
    }

    private WebElement waitOnElement(String xpath) {
        return (new WebDriverWait(driver, 30)).until(
                ExpectedConditions.elementToBeClickable(By.xpath(xpath))
        );
    }
}
