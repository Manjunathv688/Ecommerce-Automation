package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {
    private WebDriver driver;

    public Productpage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstProduct = By.xpath("//a[@class='hrefch']"); // Clicks first product
    private By addToCartButton = By.xpath("//a[text()='Add to cart']");

    public void clickFirstProduct() {
        driver.findElements(firstProduct).get(0).click(); // Click first visible product
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }
}
