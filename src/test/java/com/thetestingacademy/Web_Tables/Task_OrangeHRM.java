package com.thetestingacademy.Web_Tables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Task_OrangeHRM {
    @Test
    public void Orange_HRM () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        WebElement UserName = driver.findElement(By.xpath("//input[@name = 'username']"));
        UserName.sendKeys("admin");
        WebElement Password = driver.findElement(By.xpath("//input[@name = 'password']"));
        Password.sendKeys("Hacker@4321");
        WebElement Button = driver.findElement(By.xpath("//button[@type = 'submit']"));
        Button.click();
        Thread.sleep(3000);
        WebElement First_TerminatedEmpName = driver.findElement(By.xpath("//div[text()='Terminated']/preceding::div[5]"));
        System.out.println(First_TerminatedEmpName.getText());
        WebElement Delete1stTerminates = driver.findElement(By.xpath("//div[text()='Terminated']/following::i[1]"));
        Delete1stTerminates.click();
    }
    }
