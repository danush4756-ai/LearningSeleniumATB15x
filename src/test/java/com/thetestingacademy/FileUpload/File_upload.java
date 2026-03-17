package com.thetestingacademy.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class File_upload {
    @Test
    public void upload () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String user_dir_path = System.getProperty("user.dir");
        System.out.println(user_dir_path);
        uploadFileInput.sendKeys(user_dir_path + "\\src\\test\\java\\com\\thetestingacademy\\FileUpload\\data.json");
        driver.findElement(By.name("submit")).click();
    }
}