package tests;

import junit.framework.Assert;
import org.junit.Test;
import pages.LoginPage;
import utils.AbstractTest;

/**
 * Created by berkd on 27.11.2015.
 */
public class LoginTest extends AbstractTest {

    @Test
    public void Login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPage();
        loginPage.login("Keytorc","1234");
        Assert.assertFalse(loginPage.isLoginSuccessfull());
    }

}
