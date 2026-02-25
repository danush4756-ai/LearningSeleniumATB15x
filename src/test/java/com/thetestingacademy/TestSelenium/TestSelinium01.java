package com.thetestingacademy.TestSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestSelinium01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println("title " + driver.getTitle());
        System.out.println("currentUrl " + driver.getCurrentUrl());
        System.out.println("pageSource " + driver.getPageSource()); /*It is used to get the complete HTML
        source code of the currently loaded web page. */
        driver.quit();
    }
}
