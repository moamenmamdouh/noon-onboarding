package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegistrationPage;

public class BaseTests {
    private WebDriver driver;
    protected RegistrationPage registrationPage;

    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://register.noonstg.partners/en-ae/");
        registrationPage = new RegistrationPage(driver);
    }

    public void TearDown(){
        driver.quit();
    }
}
