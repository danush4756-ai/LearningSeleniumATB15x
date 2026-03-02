package com.thetestingacademy.TestSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Close_vs_quit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(10000);
        // driver.close(); we usually don't use this in automation
//        // Close - will close the current tab, not the session (not the all tabs)
        driver.quit();
        // It will close all the tabs. - session id == null

    }
}
