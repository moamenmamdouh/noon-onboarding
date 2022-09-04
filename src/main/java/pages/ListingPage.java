package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ListingPage {
    private WebDriver driver;
    private By fillAppButton = By.className("sc-jLiVlK");
    private By appCreationOptions = By.className("countryLabel");
    public ListingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitListing(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(fillAppButton));
    }

    public void clickFillApp(){
        driver.findElement(fillAppButton).click();
    }



    public FoodAppPage createFoodApp(){
        driver.findElements(appCreationOptions).get(0).click();
        return new FoodAppPage(driver);
    }
}
