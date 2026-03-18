package com.thetestingacademy.Iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFrame1 {
    @Test
    public void test_frame(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        Iframe_Utils frameUtils = new Iframe_Utils(driver);
        frameUtils.switchToFrame("result");
        driver.findElement(By.id("username")).sendKeys("Pramod");
        frameUtils.switchToDefault();
    }
}
