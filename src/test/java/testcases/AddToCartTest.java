package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartTest {
    private WebDriver driver;

    public AddToCartTest(WebDriver driver) {
        this.driver = driver;
    }

    private By cartLink = By.id("cartur");

    public void goToCart() {
        driver.findElement(cartLink).click();
    }
}
