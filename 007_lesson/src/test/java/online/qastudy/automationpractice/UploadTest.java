package online.qastudy.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class UploadTest extends BaseTest {

    @Test
    public void canUploadFile() throws IOException {
        driver.navigate().to("https://easyupload.io/");
        File file = new File("C:\\Users\\egorm\\Downloads\\Диплом.rar");
        WebElement containerElement = driver.findElement(By.xpath("//div[@class='upload-success hide']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].classList.remove('hide');", containerElement);
        WebElement inputElement = driver.findElement(By.id("upload-link"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly')", inputElement);
        inputElement.sendKeys(file.getCanonicalPath());
    }

    @Test
    public void canUploadFileRobot() throws InterruptedException, IOException {
        driver.navigate().to("https://easyupload.io/");
        File file = new File("C:\\Users\\egorm\\Downloads\\Диплом.rar");
        driver.findElement(By.id("dropzone")).click();
        uploadFile(file.getCanonicalPath());
        Thread.sleep(2000);
    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public static void uploadFile(String fileLocation) {
        try {
            setClipboardData(fileLocation);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}

