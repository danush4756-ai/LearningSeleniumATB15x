package com.thetestingacademy.Action_class;

import com.thetestingacademy.CommonToAllEnhanced;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class VWO_Complete_Singup_trial extends CommonToAllEnhanced {
    @Test
    public void AppVwo () {
        driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/#/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        /*By dynamicElement = By.xpath("//span[text()='Start a FREE TRIAL'] | //a[@data-qa='bericafeqo']");
        WebElement freeTrialBtn = wait.until(ExpectedConditions.elementToBeClickable(dynamicElement));
        freeTrialBtn.click();*/
        //WaitForVisibilityAndClick(driver, By.xpath("//span[text()='Start a FREE TRIAL'] | //a[@data-qa='bericafeqo']"));
        WaitForVisibilityAndClick(driver,By.xpath("//span[text()='Start a FREE TRIAL']"));
//Get all open window handles (tabs) and store them in an ArrayList
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
        emailInput.sendKeys("oyyloo9156@tempmail.rest");
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
        WaitElementToBeClickableAndClick(driver, By.xpath("//button[@data-qa='boxasuraza']"));
        //start free trial (VWO Insights - web)
        WaitForVisibilityAndClick(driver, By.xpath("//h5[text()='VWO Insights - Web']/following::button[@data-qa='cunoxonoxe'][1]"));
//add domain
        WaitForVisibilityAndClick(driver, By.xpath("//button[normalize-space()='Add domain']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body")));
    //copy
       // WaitElementToBeClickableAndClick(driver, By.xpath("//button[@data-qa='xugejexijo']"));//7 tabs
       WebElement copyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-qa='xugejexijo']")));
        // Use the native scrollToElement method
       Actions actionCopy = new Actions(driver);
        actionCopy.scrollToElement(copyButton)
                .perform();
        // Now wait for it to be clickable and click
        wait.until(ExpectedConditions.elementToBeClickable(copyButton)).click();
        //Create a temporary text box on the page to paste into
       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var input = document.createElement('textarea'); input.setAttribute('id', 'temp-paste-box'); document.body.appendChild(input);");
//  Find our new temporary box
        WebElement pasteBox = driver.findElement(By.id("temp-paste-box"));
//  Use the Actions class to simulate Ctrl + V (Use Keys.COMMAND for Mac)
        Actions actions = new Actions(driver);
        actions.click(pasteBox) // Focus on the box
                .keyDown(Keys.CONTROL) // Hold down Ctrl
                .sendKeys("v")         // Press 'v'
                .keyUp(Keys.CONTROL)   // Release Ctrl
                .perform();            // Execute the action
//  Verify the text! (For input/textarea fields, we use .getAttribute("value") instead of .getText())
        String pastedText = pasteBox.getAttribute("value");
        if(pastedText.contains("visualwebsiteoptimizer")) {
            System.out.println("Verification Passed via Actions!");
        }
    }
}
