package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PhoneRegistrationPage {
    private WebDriver driver;
    private By phoneField = By.name("phone");
    private By nextButton = By.className("sc-gacHD");

    public PhoneRegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    public void addPhone(String phoneNumber){
        driver.findElement(phoneField).sendKeys(phoneNumber);
    }
    public OTPPage clickNext() {
        driver.findElement(nextButton).click();
        return new OTPPage(driver);
    }

    public void waitPhoneRegistration(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(phoneField));
    }
}
