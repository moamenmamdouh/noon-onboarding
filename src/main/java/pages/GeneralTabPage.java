package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralTabPage {
    private WebDriver driver;
    private By nextButtonField = By.xpath
            ("//*[@id=\"__next\"]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[4]/div");
    private By businessEmailField = By.name("businessEmail");
    private By financeEmailField = By.name("financeEmail");
    public GeneralTabPage(WebDriver driver){
        this.driver = driver;
    }

    public void addBusinessEmail(String businessEmail){
        driver.findElement(businessEmailField).sendKeys(businessEmail);
    }

    public void addFinanceEmail(String financeEmail){
        driver.findElement(financeEmailField).sendKeys(financeEmail);
    }

    public VATInfoPage clickNext(WebDriver driver){
        driver.findElement(nextButtonField).click();
        return new VATInfoPage(driver);
    }
}
