package com.thetestingacademy.Selenium_waits;
import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.WaitHelpers;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static com.thetestingacademy.WaitHelpers.checkVisibility;
import static com.thetestingacademy.WaitHelpers.waitImplicitWait;
public class Explicit_waits extends CommonToAll {
    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");
       waitForPresenceOfElementXpath(driver,"//span[@data-cy='closeModal']");
       clickElementFoundXpath(driver, "//span[@data-cy='closeModal']");
        // static -
        WaitHelpers.waitJVM(10000);
        closeBrowser(driver);
    }
}
