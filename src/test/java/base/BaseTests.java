package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.RegistrationPage;

public class BaseTests {
    private WebDriver driver;
    protected RegistrationPage registrationPage;

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://register.noonstg.partners/en-ae/");
        registrationPage = new RegistrationPage(driver);
    }

    @AfterClass
    public void TearDown(){
        driver.quit();
    }
}
