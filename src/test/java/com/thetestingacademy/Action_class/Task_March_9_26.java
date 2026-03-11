package com.thetestingacademy.Action_class;
import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.CommonToAllEnhanced;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.Duration;
public class Task_March_9_26 extends CommonToAllEnhanced {
    @Test
    public void Booking_com () throws InterruptedException {
        driver = new FirefoxDriver();
        openBrowser(driver , "https://www.booking.com/");
        WaitElementToBeClickableAndClick(driver, By.xpath("//button[@aria-label='Dismiss sign-in info.']"));
        clickElementFound(driver, By.xpath("//a[@id='flights']"));
        WaitForVisibilityAndClick(driver , By.xpath("//span[text() ='Going to']"));
        //WaitForVisibility(driver, By.xpath("//input[@data-ui-name ='input_text_autocomplete']"));
        WebElement input = driver.findElement(By.xpath("//input[@data-ui-name='input_text_autocomplete']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(input)
                .keyDown(Keys.SHIFT)
                .sendKeys(input, "del")
                .keyUp(Keys.SHIFT)
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .build().perform();
        FindElementAndClick(driver, By.xpath("//span[text() ='Search']"));
    }
}
