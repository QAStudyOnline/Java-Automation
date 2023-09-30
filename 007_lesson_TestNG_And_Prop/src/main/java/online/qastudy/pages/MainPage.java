package online.qastudy.pages;

import online.qastudy.utils.TestHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;

    private final static String TITLE_PROCEED_TO_CHECKOUT = "//*[@id=\"cartModal\"]//div[2]/p[2]/a/u";

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement womenTab;

    @FindBy(css = "#block_top_menu > ul > li.sfHoverForce > a")
    private WebElement dressesTab;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a/i")
    private WebElement tShirtTab;

    @FindBy(id = "search_query_top")
    private WebElement search;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@class='product-image-container']")
    private WebElement itemView;

    @FindBy(className = "icon-th-list")
    private WebElement listView;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    private WebElement addCartButton;

    @FindBy(xpath = TITLE_PROCEED_TO_CHECKOUT)
    private WebElement proceedCheckout;

    @FindBy(xpath = "//section/div/div/div[2]/div[2]/div[2]/div/span/span")
    private WebElement totalSum;


    @FindBy(xpath = "//*[contains(@href,'controller=my-account')]")
    private WebElement singIn;

    @FindBy(xpath = "//*[@title='Contact Us']")
    private WebElement contactUs;

    @FindBy(id = "layered_id_attribute_group_3")
    private WebElement sizeLcheckbox;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage clickWomenTab() {
        new TestHelper(driver).waitUntilElementWillBeClickable(womenTab).click();
        return this;
    }

    public MainPage clickDressesTab() {
        dressesTab.click();
        return this;
    }

    public void clickTShirtTab() {
        tShirtTab.click();
    }

    public SignInPage clickSignIn(){
        singIn.click();
        return new SignInPage(driver);
    }

    public MainPage selectSizeL(){
        sizeLcheckbox.click();
        return this;
    }

    public void clickAddToCart(){
        addCartButton.click();
    }

    public void navigateToItemView () {
        Actions actions = new Actions(driver);
        actions.moveToElement(itemView).build().perform();
    }

    public void scrollToItem(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", itemView);
    }

    public void clickProceedToCheckout() {
        new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(By.
                        xpath(TITLE_PROCEED_TO_CHECKOUT))).click();
    }

    public String getTotalPrice(){
        return totalSum.getText();
    }
}
