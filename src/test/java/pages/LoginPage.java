package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by berkd on 27.11.2015.
 */
public class LoginPage{
    WebDriver driver;
    String pageURL= "https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fie%3DUTF8%26_encoding%3DUTF8%26ref_%3Dnav_ya_signin";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(pageURL);
    }

    public void login(String userName,String password) {
        driver.findElement(By.id("ap_email")).sendKeys(userName);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
    }

    public boolean isLoginSuccessfull() {
        if (driver.findElements(By.id("nav-link-accountList")).size() > 0) return true;
        return false;
    }
}
