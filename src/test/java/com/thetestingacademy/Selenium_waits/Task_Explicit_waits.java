package com.thetestingacademy.Selenium_waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class Task_Explicit_waits {
    @Test
    public void VW_app() {
            EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
            driver.get("https://app.vwo.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));/*no waiting happens here it is
        for future use*/
            WebElement emailInputBox = driver.findElement(By.cssSelector("#login-username"));
            emailInputBox.sendKeys("admin@admin.com");
            WebElement passwordInputBox = driver.findElement(By.cssSelector("[name='password']"));
            passwordInputBox.sendKeys("password@321");
            WebElement buttonSubmit = driver.findElement(By.cssSelector("#js-login-btn"));
            buttonSubmit.click();
        WebElement errormsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#js-notification-box-msg")));
        String actualText = errormsg.getText();
        Assert.assertEquals(actualText, "Your email, password, IP address or location did not match");
        }
    }

