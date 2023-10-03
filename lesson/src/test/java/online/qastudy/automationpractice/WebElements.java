package online.qastudy.automationpractice;


import online.qastudy.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static javafx.scene.input.KeyCode.M;


public class WebElements {

    private WebDriver driver;


    @FindBy(xpath = "//*[@class='fa fa-home']")
    public static WebElement homeButton;

    @FindBy(xpath = "//*[@class='material-icons card_travel']")
    private WebElement productsButton;

    @FindBy(xpath = "//*[@id='header']//*[@href='/view_cart']")
    private WebElement cartButton;

    @FindBy(xpath = "//*[@href='/login']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@href='/test_cases']//*[@class='fa fa-list']")
    private WebElement testcasesButton;

    @FindBy(xpath = "//*[@href='/api_list']//*[@class='fa fa-list']")
    private WebElement apilistButton;

    @FindBy(xpath = "//*[@class='fa fa-youtube-play']")
    private WebElement videotutorialsButton;

    @FindBy(xpath = "//*[@class='fa fa-envelope']")
    private WebElement contactusButton;

    @FindBy(xpath = "//*[@href='/test_cases']//*[@class='btn btn-success']")
    private WebElement testcasescaruselButton;

    @FindBy(xpath = "//*[@href='/api_list']//*[@class='btn btn-success']")
    private WebElement apilistcaruselButton;

    @FindBy(xpath = "//*[@data-toggle='collapse'][@href='#Women']")
    private WebElement categorywomenButton;

    @FindBy(xpath = "//*[@data-toggle='collapse'][@href='#Men']")
    private WebElement categorymenButton;

    @FindBy(xpath = "//*[@data-toggle='collapse'][@href='#Kids']")
    private WebElement categorykidsButton;

    @FindBy(xpath = "//*[@href='/category_products/1']")
    private WebElement categorywomendressButton;

    @FindBy(xpath = "//*[@href='/category_products/2']")
    private WebElement categorywomentopsButton;

    @FindBy(xpath = "//*[@href='/category_products/7']")
    private WebElement categorywomensareeButton;

    @FindBy(xpath = "//*[@href='/category_products/3']")
    private WebElement categorymentshirtsButton;

    @FindBy(xpath = "//*[@href='/category_products/6']")
    private WebElement categorymenjeansButton;

    @FindBy(xpath = "//*[@href='/category_products/4']")
    private WebElement categorykidsdressButton;

    @FindBy(xpath = "//*[@href='/category_products/5']")
    private WebElement categorykidstopsandshirtsButton;

    @FindBy(xpath = "//*[@href='/brand_products/Polo']")
    private WebElement brandspoloButton;

    @FindBy(xpath = "//*[@href='/brand_products/H&M']")
    private WebElement brandshmButton;

    @FindBy(xpath = "//*[@href='/brand_products/Madame']")
    private WebElement brandsmadameButton;

    @FindBy(xpath = "//*[@href='/brand_products/Mast & Harbour']")
    private WebElement brandsmastharbourButton;

    @FindBy(xpath = "//*[@href='/brand_products/Babyhug']")
    private WebElement brandbabyhugButton;

    @FindBy(xpath = "//*[@href='/brand_products/Allen Solly Junior']")
    private WebElement brandballensollyjuniorButton;

    @FindBy(xpath = "//*[@href='/brand_products/Kookie Kids']")
    private WebElement brandkookiekidsrButton;

    @FindBy(xpath = "//*[@href='/brand_products/Biba']")
    private WebElement brandbibaButton;

    @FindBy(xpath = "//*[@id='susbscribe_email']")
    private WebElement youremailaddressField;

    @FindBy(xpath = "//*[@id='subscribe']/i")
    public static WebElement subscribeButton;

}

