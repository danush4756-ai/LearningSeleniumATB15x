package com.thetestingacademy.Xpath;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
public class Xpath_2st_mini_project {
    @Owner("Pramod")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
            Thread.sleep(2000);
            WebElement Make_appointment = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
            Make_appointment.click();
        Thread.sleep(2000);
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        input_username.sendKeys("John Doe");
        WebElement input_password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        input_password.sendKeys("ThisIsNotAPassword");
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();
        driver.quit();
    }
}
