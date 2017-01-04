package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;

/**
 * Created by berkd on 27.11.2015.
 */
public class HomePage {
    WebDriver driver;
    String pageURL= "https://www.amazon.com";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(pageURL);
    }

    public void searchProduct(String productName) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        driver.findElement(By.id("twotabsearchtextbox")).submit();
    }

    public boolean isProductDisplayed () {
        try {
            if (driver.findElement(By.id("noResultsTitle")).isDisplayed())
                return false;
            else return true;
        }catch (NotFoundException e) {
            return true;
        }
    }

}
