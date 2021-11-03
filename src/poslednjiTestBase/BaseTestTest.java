package poslednjiTestBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import poslednjiTestBase.XcelReaderTest;
import poslednjiTestPages.Cart;
import poslednjiTestPages.GalaxyS6;
import poslednjiTestPages.HomePagePT;
import poslednjiTestPages.LogedInPagePT;
import poslednjiTestPages.MacBook;
import poslednjiTestPages.SamsungGalaxyS7;


public class BaseTestTest {

	public WebDriver driver;
	public HomePagePT homePagePT;
	public LogedInPagePT logedInPagePT;
	public SamsungGalaxyS7 samsungGalaxyS7;
	public Cart cart;
	public MacBook macbook;
	public GalaxyS6 galaxyS6;
	public XcelReaderTest xcelReaderTest;
	public String homeurl;
	 public static WebDriverWait wdwait;
	
	@BeforeClass
	 public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		driver = new ChromeDriver();
		homePagePT = new HomePagePT (driver);
		samsungGalaxyS7 =new SamsungGalaxyS7(driver);
		logedInPagePT= new LogedInPagePT(driver);
		cart = new Cart(driver);
		galaxyS6 =new GalaxyS6 (driver);
		macBook = new MacBook(driver);
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
//		xcelReaderTest = new XcelReaderTest("/Users/jelenadabetic/Desktop/XcelReaderTest.xlsx"); 
//		homeurl = xcelReaderTest.getStringData("LoginTest",1, 0);
//		wdwait = new WebDriverWait (driver, 20);
	}
	
	 @AfterClass
	    public void tearDown() {
	        driver.close();
	        driver.quit();
	    }

}
