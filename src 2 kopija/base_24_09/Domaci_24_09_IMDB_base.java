package base_24_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages_24_09.LogEDInPageIMDB;
import pages_24_09.LogInPageIMDB;
import pages_24_09.MainPageIMDB;
import pages_24_09.PreLogInIMDB;
import pages_24_09.WishListPageIMDB;


public class Domaci_24_09_IMDB_base {
	
	/*
	 Napraviti program koji ce proveriti da li funkcionise dodavanje filmova u Watchlistu na sajtu IMDB (edited) 

Podrazumeva se da koristite POM, prvo prodjite manuelno, pogledajte sta sve treba da se radi, 
razmislite kako da budete sigurni da je film dodat (slicno kao sto smo radili korpu za Amazon zadatak), 
proverite manuelno da li korisnik mora da se uloguje ili moze da bude izlogovan itd
	 */
	
	 public WebDriver driver;
	 public MainPageIMDB mainPageIMDB;
	 public PreLogInIMDB preLogInIMDB;
	 public LogInPageIMDB logInPageIMDB;
	 public LogEDInPageIMDB logEDInPageIMDB;
	 public WishListPageIMDB wishListPageIMDB;
	    

	    @BeforeClass
	    public void setUp() {
	     
	    	System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
	        driver = new ChromeDriver();
	        mainPageIMDB = new MainPageIMDB(driver);
	        preLogInIMDB = new PreLogInIMDB (driver);
	        logInPageIMDB = new LogInPageIMDB(driver);
	        wishListPageIMDB= new WishListPageIMDB(driver);
	       
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.close();
	        driver.quit();
	    }

	}


