package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicTabPage {

    private WebDriver driver;
    private By nextButtonField = By.xpath
            ("//*[@id=\"__next\"]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[4]/div");
    private By legalNameField = By.name("legalName");
    private By displayNameEnField = By.name("displayNameEn");
    private By displayNameArField = By.name("displayNameAr");
    private By phoneField = By.name("phone");
    public BasicTabPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addLegalName(String legalName){
        driver.findElement(legalNameField).sendKeys(legalName);
    }

    public void addDisplayNameEn(String displayNameEn){
        driver.findElement(displayNameEnField).sendKeys(displayNameEn);
    }

    public void addDisplayNameAr(String displayNameAr){
        driver.findElement(displayNameArField).sendKeys(displayNameAr);
    }

    public void addPhone(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }

    public GeneralTabPage clickNext(WebDriver driver){
        driver.findElement(nextButtonField).click();
        return new GeneralTabPage(driver);
    }
}
