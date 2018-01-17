package utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by berkd on 27.11.2015.
 */
public class AbstractTest {
    protected static WebDriver driver;
	protected static Configuration configuration;

    @BeforeClass
    public static void openWebsite() {
    	configuration = new Configuration();
        System.setProperty("webdriver.gecko.driver",configuration.getGeckoDriverPath());
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeWebsite(){
        driver.quit();
    }
}
