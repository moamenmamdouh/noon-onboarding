package pages;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OTPPage {
    private WebDriver driver;
    private By otpFields = By.tagName("input");
    private By nextButton = By.className("sc-gacHD");
    public OTPPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addOTP(){
        int otpStaging = 1;
        List<WebElement> otpList = driver.findElements(otpFields);
        for(int i=0; i<5; i++){
            otpList.get(i).sendKeys(String.valueOf(otpStaging));
            otpStaging++;
        }
    }

    public ListingPage clickNext() {
        driver.findElement(nextButton).click();
        return new ListingPage(driver);
    }
}
