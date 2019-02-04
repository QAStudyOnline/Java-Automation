package online.qastudy.pages.attributes;

import com.sun.istack.internal.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlreadyRegistered {

    private WebDriver driver;

    @FindBy(id = "withEmail")
    private WebElement emailField;


    @FindBy(id = "passwd")
    private WebElement passwdField;

    @FindBy(id = "SubmitLogin")
    private WebElement signInBtn;

    public AlreadyRegistered(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AlreadyRegistered typeEmail(String email){
        return setUserData(email, emailField);
    }

    public AlreadyRegistered typePassword(String passwd){
        return setUserData(passwd, passwdField);
    }

    public void clickSingIn(){
        signInBtn.click();
    }

    private AlreadyRegistered setUserData(@NotNull String passwd, @NotNull WebElement element) {
        if (!element.getText().isEmpty()){
            element.sendKeys(passwd);
        }else {
            element.clear();
            element.sendKeys(passwd);
        }
        return this;
    }
}
