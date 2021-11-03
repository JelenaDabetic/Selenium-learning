package Hero_BaseTest_27_09;


	import Hero_Pages_27_09.D_logIn;
	import Hero_Pages_27_09.D_logOut;
	import org.apache.xml.resolver.readers.XCatalogReader;
//import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	import java.io.IOException;

	public class D_base {

	    public static WebDriver driver;
	    public static D_logIn d_logIn;
	    public D_logOut d_logOut;
	    public XcellReader xcelReader;
	    public String homeUrl;
	    public static WebDriverWait wdwait;

	    @BeforeClass
	    public void setUp() throws IOException {
	        //WebDriverManager.chromedriver().setup();
	        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	        driver = new ChromeDriver();
	        d_logIn = new D_logIn(driver, wdwait);
	        d_logOut = new D_logOut(driver);
	        xcelReader = new XcellReader("/Users/jelenadabetic/Desktop/xcel1");
	        homeUrl = xcelReader.getStringData("LoginTest",1, 0);
	        wdwait = new WebDriverWait(driver, 20);
	    }

	    @AfterClass
	    public void tearDown() {
	        //driver.close();
	        //driver.quit();
	    }


	}


