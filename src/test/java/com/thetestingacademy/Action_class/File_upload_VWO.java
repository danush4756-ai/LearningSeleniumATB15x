package com.thetestingacademy.Action_class;

import com.thetestingacademy.CommonToAllEnhanced;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class File_upload_VWO extends CommonToAllEnhanced {
    @Test
    public void photo_upload () {
        driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //mail ID - meswfw9608@supermmw.online
        //password - bqVki#5EhJtb-95
        WaitForVisibilityAndSendKeys(driver, By.xpath("//input[@data-qa='hocewoqisi']"),"meswfw9608@supermmw.online");
        sendKeysToElementFound(driver, By.xpath("//input[@data-qa='jobodapuxe']"),"bqVki#5EhJtb-95");
    clickElementFound(driver, By.xpath("//span[@data-qa='ezazsuguuy']"));
    //GoToSettings
        WaitElementToBeClickableAndClick(driver, By.xpath("//a[@data-qa='xicevuhilu']"));
        WaitElementToBeClickableAndClick(driver, By.xpath("//span[text()='Profile details']"));
        Actions actions = new Actions(driver);//6 tabs
        for(int i = 0; i < 10; i++){
            actions.sendKeys(Keys.TAB).perform();
        }
                actions.perform();
    WaitPresenceOfElementAndSendKeys(driver, By.xpath("//input[@data-qa='wekuqafoqo']"),"C:\\Users\\DELL\\Downloads\\WhatsApp Unknown 2026-02-28 at 1.58.19 PM\\WhatsApp Image 2026-02-28 at 1.58.06 PM (1).jpeg");
    }
}
