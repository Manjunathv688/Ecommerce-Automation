package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {
    private WebDriver driver;

    public RegisterTest(WebDriver driver) {
        this.driver = driver;
    }

    private By signupLink = By.id("signin2");
    private By usernameField = By.id("sign-username");
    private By passwordField = By.id("sign-password");
    private By signupButton = By.xpath("//button[text()='Sign up']");

    public void openSignup() {
        driver.findElement(signupLink).click();
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignup() {
        driver.findElement(signupButton).click();
    }
}
