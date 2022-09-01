package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OTPPage {

    private WebDriver driver;

    public OTPPage(WebDriver driver){
        this.driver = driver;
    }

    private By otpList = By.tagName("input");
    private By nextButton = By.className("sc-gacHD");
    private By otpTitle = By.className("topLabel");

    public void addOTP(){

        List<WebElement> otpFields = driver.findElements(otpList);

        for(int i=0; i<otpFields.size(); i++){
            otpFields.get(i).sendKeys(Integer.toString(i+1));
        }
    }

    public ListingPage clickNext(){
        driver.findElement(nextButton).click();
        return new ListingPage(driver);
    }

    public void waitOTP(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(otpTitle));
    }
}
