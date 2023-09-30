package online.qastudy.automationpractice;

import online.qastudy.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopTest extends BaseTest {

    private MainPage mainPage;

    @BeforeMethod
    public void setupMainPage() {
        mainPage = new MainPage(driver);
    }


    @Test
    public void canCheckTotlaPriceForTShirt() {
        mainPage.clickTShirtTab();
        //mainPage.scrollToItem();
        //mainPage.navigateToItemView();
        String actualResult = mainPage.getTotalPrice();
        String expectedResult = "Rs. 500";
        mainPage.clickAddToCart();
        mainPage.clickProceedToCheckout();

        Assert.assertEquals(expectedResult, actualResult, "If test failed then total price was changed");
    }
}
