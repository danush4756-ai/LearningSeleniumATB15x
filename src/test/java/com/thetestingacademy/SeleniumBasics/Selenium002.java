package com.thetestingacademy.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium002 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
    }
}
