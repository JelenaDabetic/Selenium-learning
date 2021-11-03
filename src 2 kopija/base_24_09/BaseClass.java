package base_24_09;



//mport io.github.bonigarcia.wdm.WebDriverManager;
import pages_24_09.LogInPage;
import pages_24_09.LogOutPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public WebDriver driver;
    public LogInPage logInPage;
    public LogOutPage logOutPage;

    @BeforeClass
    public void setUp() {
        //WebDriverManager.chromedriver().setup();
    	System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
        driver = new ChromeDriver();
        logInPage = new LogInPage(driver);
        logOutPage = new LogOutPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}



