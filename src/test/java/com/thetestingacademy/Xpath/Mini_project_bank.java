package com.thetestingacademy.Xpath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Mini_project_bank {
    @Test
public void TAA_Bank () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //open the url
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //Sign Up
        WebElement Sign_Up = driver.findElement(By.xpath("//button[@class='font-medium text-blue-600 hover:text-blue-500 focus:outline-none']"));
Sign_Up.click();
WebElement Full_Name = driver.findElement(By.xpath("//input[@placeholder='John Doe']"));
Full_Name.sendKeys("John Doe");
WebElement Email_Address = driver.findElement(By.xpath("//input[@placeholder='you@example.com']"));
Email_Address.sendKeys("you@example.com");
WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
Password.sendKeys("password");
WebElement Create_Account = driver.findElement(By.xpath("//button[@type='submit']"));
Create_Account.click();
        Thread.sleep(2000);
//Transfer Fund
        WebElement Transfer_Funds = driver.findElement(By.xpath("//button[normalize-space()='Transfer Funds']"));
/*button[text()='Transfer Funds']*/
Transfer_Funds.click();
        Thread.sleep(2000);
        WebElement Amount = driver.findElement(By.xpath("//input[@type='number']"));
Amount.sendKeys("5000");
WebElement Continue = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
Continue.click();
            Thread.sleep(2000);
WebElement Confirm_Transfer = driver.findElement(By.xpath("//button[normalize-space()='Confirm Transfer']"));
Confirm_Transfer.click();
            Thread.sleep(2000);
            //Dashboard
        WebElement Dashboard = driver.findElement(By.xpath("//button[normalize-space()='Dashboard']"));
    Dashboard.click();
        Thread.sleep(2000);
        String UpdatedBalance = driver.findElement(By.xpath("//p[normalize-space()='Total Balance']/following-sibling::h3")).getText();
        Assert.assertEquals(UpdatedBalance, "$45,000.00");
    }
}
