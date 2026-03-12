package com.thetestingacademy.Action_class;

import com.thetestingacademy.CommonToAllEnhanced;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeMyTrip extends CommonToAllEnhanced {
    @Test
    public void Make_My_trip () {
        driver = new FirefoxDriver();
openBrowser(driver, "https://www.makemytrip.com/");
WaitForVisibilityAndClick(driver, By.xpath("//span[@data-cy='closeModal']"));
WaitForVisibilityAndClick(driver, By.xpath("//img[@alt='minimize']"));
        WebElement background_element = driver.findElement(By.tagName("body"));
        background_element.click(); // just to remove the transparent layer.
        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
        Actions actionsFrom = new Actions(driver);
        actionsFrom.moveToElement(fromCity)
                .click()
                .pause(Duration.ofSeconds(3))
                .sendKeys("IXC")
                .build().perform();
        WaitForVisibilityAndClick(driver, By.xpath("//span[contains(text(), 'Chandigarh')]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy='toCity']"));
        Actions actionsTo = new Actions(driver);
        actionsTo.moveToElement(toCity)
                .click()
                .pause(Duration.ofSeconds(3))
                .sendKeys("DEL")
                .build().perform();
        WaitForVisibilityAndClick(driver, By.xpath("//span[contains(text(), 'Delhi')]"));
    }
}
