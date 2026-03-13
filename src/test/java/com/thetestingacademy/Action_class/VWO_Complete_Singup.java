package com.thetestingacademy.Action_class;

import com.thetestingacademy.CommonToAllEnhanced;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class VWO_Complete_Singup extends CommonToAllEnhanced {
    @Test
    public void AppVwo () {
        driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
WaitForVisibilityAndClick(driver, By.xpath("//span[text()='Start a FREE TRIAL']"));
        //clickElementFound(driver,By.xpath("//a[@data-qa='bericafeqo']"));
// Get all open window handles (tabs) and store them in an ArrayList
        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
// Switch focus to the new tab (index 1 is the second tab)
        driver.switchTo().window(allTabs.get(1));
        WaitForVisibilityAndSendKeys(driver,By.xpath("//input[@data-qa='page-su-step1-v1-email']"), "namal56@gmail.com");
        WebElement errormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = \"gmail.com doesn't look like a business domain. Please use your business email.\"]")));
        String actualText = errormsg.getText();
        Assert.assertEquals(actualText, "gmail.com doesn't look like a business domain. Please use your business email.");
        //Send correct keys
// 1. Locate the email input field
        WebElement emailInput = driver.findElement(By.xpath("//input[@data-qa='page-su-step1-v1-email']"));
// 2. Clear the existing incorrect email
        emailInput.clear();
// 3. Send the correct business email
        emailInput.sendKeys("meswfw9608@supermmw.online");
        clickElementFound(driver, By.xpath("//input[@data-qa='page-free-trial-step1-gdpr-consent-checkbox']"));
        clickElementFound(driver,By.xpath("//button[text()='Create a Free Trial Account']"));
        //Create Account
    WaitForVisibilityAndSendKeys(driver, By.xpath("//input[@data-qa='page-su-v1-fname']"),"Arsh");
    sendKeysToElementFound(driver, By.xpath("//input[@data-qa='page-su-v1-lname']"), "Harsh");
sendKeysToElementFound(driver, By.xpath("//input[@data-qa='page-su-v1-pnumber']"),"8660351577");
    clickElementFound(driver, By.xpath("//button[text()='Create Account']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body")));
    //skip & continue
        WaitForVisibilityAndClick(driver,By.xpath("//button[@data-step='free-trial-thankyou']"));
        //save
        WaitForVisibilityAndClick(driver, By.xpath("//button[@data-qa='boxasuraza']"), 50);
        //start free trial (VWO Insights - web)
        WaitForVisibilityAndClick(driver, By.xpath("//h5[text()='VWO Insights - Web']/following::button[@data-qa='cunoxonoxe'][1]"));
//add domain
        WaitForVisibilityAndClick(driver, By.xpath("//button[normalize-space()='Add domain']"));
    //copy
        WebElement copyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-qa='xugejexijo']")));
        Actions GoToCopy = new Actions(driver);
        for(int i = 0; i < 7; i++){
            GoToCopy.sendKeys(Keys.TAB).perform();
        }
                GoToCopy.sendKeys(Keys.ENTER).perform();
// Opens a new tab and automatically switches Selenium's focus to it
        driver.switchTo().newWindow(WindowType.TAB);
// Now you can navigate to a new URL in this new tab
        driver.get("https://www.google.com");
        //Find the actual Google Search box (its HTML name attribute is "q")
        WebElement googleSearchBox = driver.findElement(By.className("gLFyf"));
//  Use the Actions class to simulate Ctrl + V (Use Keys.COMMAND for Mac)
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL) // Hold down Ctrl
                .sendKeys("v")         // Press 'v'
                .keyUp(Keys.CONTROL)   // Release Ctrl
                .perform();            // Execute the action
//  Verify the text! (For input/textarea fields, we use .getAttribute("value") instead of .getText())
        String pastedText = googleSearchBox.getAttribute("value");
        if(pastedText.contains("visualwebsiteoptimizer")) {
            System.out.println("Verification Passed via Actions!");
        } else {
            System.out.println("not copied or not copied not to pasted");
        }
    }
}
