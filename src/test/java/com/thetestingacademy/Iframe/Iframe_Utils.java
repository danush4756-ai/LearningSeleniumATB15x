package com.thetestingacademy.Iframe;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Iframe_Utils {
        WebDriver driver;
        public Iframe_Utils(WebDriver driver) {
            this.driver = driver;
        }
        private WebDriverWait getWait(WebDriver driver, int timeInSeconds) {
            return new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        }
        // Switch back to main page
        public void switchToDefault() {
            driver.switchTo().defaultContent();
            System.out.println("Switched back to main page");
        }
        // Switch back one level
        public void switchToParent() {
            driver.switchTo().parentFrame();
            System.out.println("Switched to parent frame");
        }
        // Switch into frame safely with explicit wait
        public void switchToFrame(String frameId) {
            getWait(driver, 10)
                    .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));
            System.out.println("Switched to frame: " + frameId);
        }
        public void switchToFrame(String frameId, Integer timeInSeconds) {
            getWait(driver, timeInSeconds)
                    .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));
            System.out.println("Switched to frame: " + frameId);
        }
    }
}