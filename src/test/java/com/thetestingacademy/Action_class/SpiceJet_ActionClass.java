package com.thetestingacademy.Action_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class SpiceJet_ActionClass {
    @Test
    public void test_speicejet() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        WebElement origin = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));
        Actions actions = new Actions(driver);
        actions
                .moveToElement(origin).click().sendKeys("BLR")
                .moveToElement(destination).sendKeys("DEL")/*sometime .click will work, but sometimes
                it will not be required*/
                .build().perform();
    }
}