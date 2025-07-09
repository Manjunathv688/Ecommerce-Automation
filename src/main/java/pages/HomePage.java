package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By categoryPhone = By.linkText("Phones");
    private By categoryLaptop = By.linkText("Laptops");
    private By categoryMonitor = By.linkText("Monitors");

    public void selectPhonesCategory() {
        driver.findElement(categoryPhone).click();
    }

    public void selectLaptopsCategory() {
        driver.findElement(categoryLaptop).click();
    }

    public void selectMonitorsCategory() {
        driver.findElement(categoryMonitor).click();
    }
}
