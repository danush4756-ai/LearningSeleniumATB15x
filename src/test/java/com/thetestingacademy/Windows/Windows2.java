package com.thetestingacademy.Windows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class Windows2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URL = "https://app.vwo.com/#/login";
        driver.get(URL);
        driver.manage().window().maximize();
        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        WebElement link_parent = driver.findElement(By.xpath("//span[normalize-space()='Start a FREE TRIAL']"));
        link_parent.click();
        Set<String> windows_handles_ids = driver.getWindowHandles();
        for (String window : windows_handles_ids) {
            System.out.println(window);
            if (!window.equalsIgnoreCase(parent_id)) {
                driver.switchTo().window(window);
                // Get the title of the window Selenium is currently focused on
                String currentTitle = driver.getTitle();
                System.out.println("The current window title is: " + currentTitle);
// If the title matches what you expect for the new tab, it worked!
                if (currentTitle.contains("Get Started with Free Trial | VWO")) {
                    System.out.println("Successfully switched to the new window!");
                }
        }
    }
    }
    }
