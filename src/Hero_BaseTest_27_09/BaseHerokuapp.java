package Hero_BaseTest_27_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Hero_Pages_27_09.LogInPageHerokuapp;
import Hero_Pages_27_09.LogOutPageHerokuapp;

public class BaseHerokuapp {

	    public WebDriver driver;
	    public LogInPageHerokuapp logInPageHerokuapp;
	    public LogOutPageHerokuapp logOutPageHerokuapp;
	    public  XcellReader xcellReader;
	    public String homeUrl;
        public static WebDriverWait wdwait;

	    @BeforeClass
	    public void setUp() {
	        ;
	    	System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
	        driver = new ChromeDriver();
	        logInPageHerokuapp = new LogInPageHerokuapp(driver);
	        logOutPageHerokuapp = new LogOutPageHerokuapp(driver); 
	        xcellReader = new XcellReader ();
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.close();
	        driver.quit();

	    
	    
	    
	    ///-----
	        public class BaseTest {

	            public static WebDriver driver;
	            
	            public static LogInPage logInPage;
	            public LogOutPage logOutPage;
	            public XcelReader xcelReader;
	            public String homeUrl;
	            public static WebDriverWait wdwait;

	            @BeforeClass
	            public void setUp() throws IOException {
	                WebDriverManager.chromedriver().setup();
	                //System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	                driver = new ChromeDriver();
	                logInPage = new LogInPage(driver, wdwait);
	                logOutPage = new LogOutPage(driver);
	                xcelReader = new XcelReader("C:\\Users\\drago\\OneDrive\\Desktop\\TestData.xlsx");
	                homeUrl = xcelReader.getStringData("LoginTest",1, 0);
	                wdwait = new WebDriverWait(driver, 20);
	            }

	            @AfterClass
	            public void tearDown() {
	                //driver.close();
	                //driver.quit();
	            }


	        }
	        
	        
	        }
}


