package com.thetestingacademy.Web_Tables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Task_DemoQA {
    @Test
    public void DemoQA() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
        Thread.sleep(2000);
        // Now, you simply call your helper method 5 times with different data!
        addEmployee(driver, "Darshan", "T S", "darshan@example.com", "28", "400000", "Quality assurance");
        addEmployee(driver, "Jane", "Doe", "jane@example.com", "30", "500000", "Engineering");
        addEmployee(driver, "Sam", "Smith", "sam@example.com", "25", "350000", "Legal");
        addEmployee(driver, "Alice", "Jones", "alice@example.com", "35", "600000", "HR");
        addEmployee(driver, "Bob", "Brown", "bob@example.com", "40", "700000", "Finance");
WebElement Delete1st_Legal = driver.findElement(By.xpath("//tr/td[text()='Legal']/following::td[1]/div/span[2]"));
Delete1st_Legal.click();
        //(//tr/td[text()='Legal'])[2]/following::td[1]/div/span[2] To delete 2nd legal
    }
    public void addEmployee(WebDriver driver, String fName, String lName, String email, String age, String salary, String department) throws InterruptedException {
        // 1. Click Add Button
        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
        Thread.sleep(1000); // Brief pause to let the pop-up modal open
        // 2. Fill out the form using the variables passed into the method
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fName);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lName);
        driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys(age);
        driver.findElement(By.xpath("//input[@placeholder='Salary']")).sendKeys(salary);
        driver.findElement(By.xpath("//input[@placeholder='Department']")).sendKeys(department);
        // 3. Submit
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000); // Brief pause to let the modal close before the next loop starts
    }
}