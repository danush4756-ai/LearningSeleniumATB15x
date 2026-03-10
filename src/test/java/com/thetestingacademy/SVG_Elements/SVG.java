package com.thetestingacademy.SVG_Elements;
import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.WaitHelpers;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
public class SVG extends CommonToAll {
        ChromeDriver driver;
        @Description("Verify that the on search with svg icon results are visible.")
        @Test
        public void test_Flipkart_Search_SVG_Icon() {
            driver = new ChromeDriver();
            openBrowser(driver, "https://www.flipkart.com/search");
            WebElement search_input = driver.findElement(By.name("q"));
            search_input.sendKeys("macmini");
            List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
            svgElements.get(0).click(); //* (Grab everything)
            /* //*[local-name()='svg'][1]. By this path we can get 86 SVGs which means 86 parents have at
            leat 1 SVG and it fetches 1st SVG of all parents. Suppose but only 56 parents have at least
            2 SVGs then if we give the index number as [2] it will give 2nd svg these of 56 parents*/
            WaitHelpers.checkVisibility(driver,By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
            List<WebElement> titlesResults = driver.findElements(By.xpath("//a[@class='pIpigb']"));
            for(WebElement title : titlesResults){
                // Get the title
                String titleText = title.getText();
                //Get the price
                //String priceText = title.findElement(By.xpath(".//following-sibling::a[@class='fb4uj3']/div/div[1]")).getText();
                //String priceText = title.findElement(By.xpath(".//ancestor::div[@data-id][1]//div[@class='hZ3P6w']")).getText();
                //String priceText = title.findElement(By.xpath(".//following::div[@class='hZ3P6w'][1]")).getText();
                String priceText = title.findElement(By.xpath(".//following::a[@class='fb4uj3']/div/div[1][contains(text(), '₹')][1]")).getText();
                System.out.println(titleText + " = " + priceText);
            }
            List<WebElement> priceText1 = driver.findElements(By.xpath("//a[@class='pIpigb' and (contains(text(), 'Mac Mini') or contains(text(), 'HN/A'))]/following-sibling::a/div/div[contains(text(), '₹')][1]"));
            int minPrice = Integer.MAX_VALUE;
            for(WebElement price : priceText1){
                String text = price.getText();
                text = text.replace("₹","").replace(",","");
                int value = Integer.parseInt(text);//converts text to Integer
                if(value < minPrice){
                    minPrice = value;
        }
    }
            System.out.println("Minimum Price: ₹" + minPrice);
        }
}