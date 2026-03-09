package com.thetestingacademy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class CommonToAll {
    public ChromeDriver driver;
    public void openBrowser(WebDriver driver,String url){
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void closeBrowser(WebDriver driver){
        driver.quit();
    }
    public void waitForVisibilityXpath(WebDriver driver, int timeInSeconds,String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public void waitForVisibilityXpath(WebDriver driver,String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public void waitForPresenceOfElementXpath(WebDriver driver,String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
    }
    public void waitForTextToBePresentXpath(WebDriver driver, int timeInSeconds,String xpath,String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(xpath)),text));
    }
    public void waitForAlert(WebDriver driver, int timeInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.alertIsPresent());
        //You cannot use an XPath because the alert does not exist in the website's HTML code.
    }
    public void waitForJVM(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickElementFoundXpath(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }
}
