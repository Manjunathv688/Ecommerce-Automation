package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutTest {
    private WebDriver driver;

    public CheckoutTest(WebDriver driver) {
        this.driver = driver;
    }

    private By placeOrderButton = By.xpath("//button[text()='Place Order']");
    private By nameField = By.id("name");
    private By countryField = By.id("country");
    private By cityField = By.id("city");
    private By cardField = By.id("card");
    private By monthField = By.id("month");
    private By yearField = By.id("year");
    private By purchaseButton = By.xpath("//button[text()='Purchase']");

    public void clickPlaceOrder() {
        driver.findElement(placeOrderButton).click();
    }

    public void fillOrderForm(String name, String country, String city, String card, String month, String year) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(countryField).sendKeys(country);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(cardField).sendKeys(card);
        driver.findElement(monthField).sendKeys(month);
        driver.findElement(yearField).sendKeys(year);
    }

    public void clickPurchase() {
        driver.findElement(purchaseButton).click();
    }
}
