package online.qastudy.dataprviders;

import online.qastudy.model.AccountBuilder;
import org.testng.annotations.DataProvider;

import static online.qastudy.utils.TestHelper.randomInt;

public class RegistrationPageDtaProvider {

    @DataProvider
    public Object[][] registerNewUser() {
        return new Object[][]{
                {new AccountBuilder()
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
                        .build()},
                {new AccountBuilder()
                        .withGender("Mrs.")
                        .withEmail("Napa.Valley"+ randomInt() +"@gmail.com")
                        .withPassword("Napa.Valley")
                        .withFirstCustomerName("Napa")
                        .withLastCustomerName("Valley")
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
                        .build()},
                {new AccountBuilder()
                        .withGender("Mr.")
                        .withEmail("Grey.Goose"+ randomInt() +"@gmail.com")
                        .withPassword("Grey.Goose")
                        .withFirstCustomerName("Grey")
                        .withLastCustomerName("Goose")
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
                        .build()}
        };
    }
}
