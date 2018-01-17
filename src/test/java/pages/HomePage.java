package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;

/**
 * Created by berkd on 27.11.2015.
 */
public class HomePage {
    WebDriver driver;
    String pageUrl = "https://www.amazon.com";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(pageUrl);
    }

    public void searchProduct(String productName) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        driver.findElement(By.id("twotabsearchtextbox")).submit();
    }

    public boolean isAnyProductDisplayed() {
        try {
            return !driver.findElement(By.id("noResultsTitle")).isDisplayed();
        }catch (NotFoundException e) {
            return true;
        }
    }

}
