package com.thetestingacademy.TestSelenium;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Fullscreen_RestoreDown {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(800,600));
        driver.manage().window().fullscreen();
    }
}
