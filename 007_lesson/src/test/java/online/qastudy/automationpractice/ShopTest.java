package online.qastudy.automationpractice;

import online.qastudy.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopTest extends BaseTest {

    private MainPage mainPage;

    @BeforeClass
    public void setupMainPage() {
        mainPage = new MainPage(driver);
    }


    @Test
    public void canCheckTotalPriceForTShirt() {
        mainPage.clickTShirtTab();
        mainPage.scrollToItem();
        mainPage.navigateToItemView();
        mainPage.clickAddToCart();
        mainPage.clickProceedToCheckout();

        String actualResult = mainPage.getTotalPrice();
        String expectedResult = "$18.51";

        Assert.assertEquals(expectedResult, actualResult, "If test failed then total price was changed");
    }
}
