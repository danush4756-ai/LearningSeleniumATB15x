package com.thetestingacademy.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task {
    @Test
    public void make_appointment() {
        //get url
        //WebDriver CURA = new ChromeDriver(); this is also correct but not best practice
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //click on Make Appointment
        WebElement Make_appointment = driver.findElement(By.id("btn-make-appointment"));
Make_appointment.click();
//Enter username
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");
        //Enter password
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");
        //click login button
        WebElement Login = driver.findElement(By.id("btn-login"));
        Login.click();
//url compare
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
        //check Make Appointment
String txt_Make_Appointment = driver.findElement(By.tagName("h2")).getText();
Assert.assertEquals(txt_Make_Appointment, "Make Appointment");
driver.quit();
    }
}
