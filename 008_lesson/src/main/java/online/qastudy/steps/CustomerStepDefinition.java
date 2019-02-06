package online.qastudy.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import online.qastudy.utils.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CustomerStepDefinition extends BaseStepDefinition{

    @Given("^open browser$")
    public void setUpBrowser() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("^open main page$")
    public void openMainPage(){
        driver.get(config.getProperty("baseurl"));
    }

    @And("^go to sign in^")
    public void openSignInPage(){

    }
}
