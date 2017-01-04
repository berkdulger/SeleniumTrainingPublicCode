package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by berkd on 27.11.2015.
 */
public class AbstractTest {

    public static WebDriver driver;

    @BeforeClass
    public static void openWebsite(){
        driver = new FirefoxDriver();
        driver.get("http://www.amazon.com");
    }

    @AfterClass
    public static void closeWebsite(){
        driver.quit();
    }

}
