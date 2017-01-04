package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import utils.AbstractTest;

/**
 * Created by berkd on 27.11.2015.
 */
public class SearchProductTest extends AbstractTest {

    @Test
    public void searchGalaxyS4 () {
        HomePage homePage = new HomePage(driver);
        homePage.getPage();
        homePage.searchProduct("Galaxy S6");
        Assert.assertTrue( homePage.isProductDisplayed() );
    }
}
