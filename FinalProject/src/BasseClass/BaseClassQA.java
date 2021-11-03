package BasseClass;

public class BaseClassQA {
	public WebDriver driver;
	public HomePage01 homePage01;
	public Elements02 elements02;
	public SeleniumTraining03 seleniumTraining03;
	
	public XcelReaderZavrsni xcelReaderZavrsni;
	//public String homeurl;
	public static WebDriverWait wdwait;


	@BeforeClass
	public void setUp()throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		driver = new ChromeDriver();
		
		xcelReaderZavrsni = new XcelReaderZavrsni("/Users/jelenadabetic/Desktop/QA it boot camp/xcelReaderZavrsni.xlsx");
		//homeurl = xcelReaderZavrsni.getStringData("KarticaHome",1,0);
		wdwait = new WebDriverWait (driver, 20);
		
		  homePage01 = new HomePage01(driver);
		  elements02 = new Elements02(driver);
		  seleniumTraining03 =new SeleniumTraining03(driver);
		//driver.navigate().to("https://demoqa.com/");
	}
	
	 @AfterClass
	    public void tearDown() {
	        driver.close();
	        driver.quit();
	    }	
	}