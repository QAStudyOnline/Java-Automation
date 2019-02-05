package online.qastudy.automationpractice;

import online.qastudy.model.Account;
import online.qastudy.model.AccountBuilder;
import online.qastudy.pages.MainPage;
import online.qastudy.pages.MyAccountPage;
import online.qastudy.pages.RegistrationPage;
import online.qastudy.pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

import static online.qastudy.utils.TestHelper.randomInt;

public class RegistrationTest extends BaseTest {

    private Account account;
    private MainPage mainPage;
    private SignInPage signInPage;
    private RegistrationPage registrationPage;
    private MyAccountPage myAccountPage;

    @BeforeMethod
    public void setupAccount() {
        account = new AccountBuilder()
                .withGender("Mr.")
                .withEmail("Jack.Daniels"+ randomInt() +"@gmail.com")
                .withPassword("Jack.Daniels")
                .withFirstCustomerName("Jack")
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
        mainPage = new MainPage(driver);
    }

    @Test
    public void canCreateNewAccount() {
        signInPage = mainPage.clickSignIn();
        registrationPage = signInPage.createNewAccountWithEmail(account.getEmail());
        myAccountPage = registrationPage.fillAndSubmitRegistrationForm(account);
        String actualResult = myAccountPage.getAccountName();
        String expectedResult = account.getFirstCustomerName();

        Assert.assertTrue(actualResult.contains(expectedResult),"If test failed then user name is incorrect");

    }

    @Test
    public void canCreateNewAccountChain() {
        Assert.assertTrue(mainPage.clickSignIn()
                .createNewAccountWithEmail(account.getEmail())
                .fillAndSubmitRegistrationForm(account)
                .getAccountName()
                .contains(account.getFirstCustomerName())
        );

    }
}