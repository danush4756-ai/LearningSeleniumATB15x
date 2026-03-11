package com.thetestingacademy.Action_class;

import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.CommonToAllEnhanced;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Task_March_9_26 extends CommonToAllEnhanced {
    @Test
    public void Booking_com () throws InterruptedException {
        driver = new EdgeDriver();
        openBrowser(driver , "https://www.booking.com/");
        WaitElementToBeClickableAndClick(driver, By.xpath("//button[@aria-label='Dismiss sign-in info.']"));
        Thread.sleep(3000);
        clickElementFound(driver, By.xpath("//a[@id='flights']"));
        Thread.sleep(3000);
        WaitForVisibilityAndClick(driver , By.xpath("//span[text() ='Going to']"));
        Thread.sleep(3000);
        WaitForVisibility(driver, By.xpath("//input[@data-ui-name ='input_text_autocomplete']"));
    }
}
