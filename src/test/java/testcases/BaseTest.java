package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.WebDriverFactory;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @AfterMethod
    public void teardown() {
        WebDriverFactory.quitDriver();
    }

    // ✅ ADD THIS
    public WebDriver getDriver() {
        return driver;
    }
}
