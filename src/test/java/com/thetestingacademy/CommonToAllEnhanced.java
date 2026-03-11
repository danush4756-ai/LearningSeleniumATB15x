package com.thetestingacademy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class CommonToAllEnhanced {
    public WebDriver driver;
    private WebDriverWait getWait(WebDriver driver, int timeInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
    }
    public void openBrowser(WebDriver driver, String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void closeBrowser(WebDriver driver) {
        driver.quit();
    }
    public void WaitPresenceOfElementAndClick(WebDriver driver, By locator) {
        getWait(driver, 30)
                //.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)))
                //convert the above to singular version so that .click will work
                .until(ExpectedConditions.presenceOfElementLocated(locator))
                .click();
    }
    public void clickElementFound(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void WaitElementToBeClickableAndClick(WebDriver driver, By locator) {
        getWait(driver, 30)
                .until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }
    public void WaitForVisibility(WebDriver driver, By locator) {
        getWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void WaitForVisibilityAndClick(WebDriver driver, By locator) {
        getWait(driver, 30)
                .until(ExpectedConditions.visibilityOfElementLocated(locator))
        .click();
    }
}