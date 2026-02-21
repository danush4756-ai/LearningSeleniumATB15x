package com.thetestingacademy;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium001 {
    public static void main(String[] args) {

        // Source here ->  (nagivate to the google.com)
        //  Converted -> JSON Wireprotocol | HTTP Request | api request)
        //  Browser Driver | Server ( application running on a particulr port)
        // Browser Driver -> Real Driver(

        // Selenium 3-
        // Download the driver binary
        // System.get ---  start the binary

        // Selenium 4
        // Selenium manager (application)
        // Selenium will automatically doawloan the drivers and start)
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();

        WebDriver driver2 = new ChromeDriver();
        driver2 = new EdgeDriver(); // 97% -
        driver2 = new FirefoxDriver(); // 97% -
        driver2 = new SafariDriver(); // 97% -

        RemoteWebDriver driver1 = new FirefoxDriver();

        SearchContext driver3 = new ChromeDriver();
        //SearchContext(I) -> (2) -> WebDriver(I)( ~10) -> RemoteWebDriver(C) (~15)
    }
}