package online.qastudy.steps;

import cucumber.api.java.bs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import online.qastudy.model.Account;
import online.qastudy.model.AccountBuilder;
import online.qastudy.pages.MainPage;
import online.qastudy.pages.MyAccountPage;
import online.qastudy.pages.SignInPage;
import online.qastudy.utils.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static online.qastudy.utils.TestHelper.randomInt;

public class CustomerStepDefinition extends BaseStepDefinition {

    @Given("^open browser$")
    public void setUpBrowser() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("^open main page$")
    public void openMainPage() {
        driver.get(config.getProperty("baseurl"));
    }

    @And("^close the browser$")
    public void cleanup(){
        if (driver!=null){
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }

    @And("^go to signin page$")
    public void openSignInPage() {
        mainPage = new MainPage(driver);
        mainPage.clickSignIn();
    }

    @And("^register as a new customer with name: \"([^\"]*)\"$")
    public void registerAsANewCustomer(String customerName) {
        Account account = getNewAccountInstance(customerName);
        signInPage = new SignInPage(driver);
        signInPage.createNewAccountWithEmail(account.getEmail()).fillAndSubmitRegistrationForm(account);
    }

    @Then("new customer name is \"([^\"]*)\"$")
    public void verifyCustomerName(String customerName) {
        myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.getAccountName().contains(customerName));
    }

    private Account getNewAccountInstance(String name) {
        return new AccountBuilder()
                .withGender("Mr.")
                .withEmail(name+".Daniels" + randomInt() + "@gmail.com")
                .withPassword(name+".Daniels")
                .withFirstCustomerName(name)
                .withLastCustomerName("Daniels")
                .withBirthdayDay("8")
                .withBirthdayMonth("8")
                .withBirthdayYear("1987")
                .withFirstName("Yakov")
                .withLastName("Fayn")
                .withCompany("IBM")
                .withAddress1("San Francisco 1")
                .withAddress2("Moscow 2")
                .withCity("London")
                .withState("Alabama")
                .withZipCode("02206")
                .withCountry("United States")
                .withPhoneMobile("+30995652333")
                .withAliasAddress("Alloha!")
                .build();
    }
}
