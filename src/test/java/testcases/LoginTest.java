package testcases;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLogin();
        Thread.sleep(1000);
        loginPage.enterUsername("testuser123");
        loginPage.enterPassword("testpass123");
        loginPage.clickLogin();
        Thread.sleep(2000);
    }
}
