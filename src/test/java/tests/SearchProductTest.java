package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import pages.HomePage;
import utils.AbstractTest;

/**
 * Created by berkd on 27.11.2015.
 */
public class SearchProductTest extends AbstractTest {
    @Test
    public void searchGalaxyS6() {
        HomePage homePage = new HomePage(driver);
        homePage.getPage();
        homePage.searchProduct("Galaxy S8");
        assertTrue(homePage.isAnyProductDisplayed());
    }
}
