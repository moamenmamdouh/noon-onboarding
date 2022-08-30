package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By nextButton = By.className("sc-gacHD");

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Method created to fill the email field for registration
     * @param email
     */
    public void addEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    /**
     * Method created to fill the password field for registration
     * @param password
     */
    public void addPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    /**
     * Method for submitting email and password for onboarding registration
     * @return an object for the next page -- phone registration
     */
    public PhoneRegistrationPage clickNext(){
        driver.findElement(nextButton).click();
        return new PhoneRegistrationPage(driver);
    }
}
