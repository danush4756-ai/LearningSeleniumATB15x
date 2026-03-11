package com.thetestingacademy.Action_class;

import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.CommonToAllEnhanced;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task_March_9_26 extends CommonToAllEnhanced {
    @Test
    public void Booking_com () {
        driver = new ChromeDriver();
        openBrowser(driver , "https://www.booking.com/");
        public ChromeDriver driver;

    }
}
