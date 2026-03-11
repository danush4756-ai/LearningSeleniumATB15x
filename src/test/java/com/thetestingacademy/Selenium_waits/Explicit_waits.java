package com.thetestingacademy.Selenium_waits;
import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.CommonToAllEnhanced;
import com.thetestingacademy.WaitHelpers;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static com.thetestingacademy.WaitHelpers.checkVisibility;
import static com.thetestingacademy.WaitHelpers.waitImplicitWait;
public class Explicit_waits extends CommonToAllEnhanced {
    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");
       WaitPresenceOfElementAndClick(driver,By.xpath("//span[@data-cy='closeModal']"));
       /*waitForVisibility(driver,3,"//span[@data-cy='closeModal']"); If test fails use the above
        Expected condition*/
       //clickElementFoundXpath(driver, "//span[@data-cy='closeModal']");
      //  WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        //closeModel.click();
        // static -
        WaitHelpers.waitJVM(10000); //  waitForJVM(10000);
        closeBrowser(driver);
    }
}
