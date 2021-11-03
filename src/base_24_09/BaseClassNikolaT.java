package base_24_09;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages_24_09.WikipediaNikolaT;

public class BaseClassNikolaT {

	/*
	//Zadatak 1) https://www.wikipedia.org/
	Na stranici otkucati Nikola Tesla i proveriti da li se otvorila 
	ispravna stranica. Radili smo vec ovo pa najbolje da krenemo od poznatih stvari. 
	Koristimo naravno POM i savetujem vas da ne radite 
	copy paste vec da kucate sami, to je definitivno najbolji nacin da se nauci ovo. 
	Lako mozete da odradite ako samo kopirate ali nije to poenta.

*/
	
	
	  	public WebDriver driver;
	    public WikipediaNikolaT wikipediaNikolaT;


	    @BeforeClass
	    public void setUp() {
	        //WebDriverManager.chromedriver().setup();
	    	System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
	        driver = new ChromeDriver();
	        wikipediaNikolaT = new WikipediaNikolaT (driver); //ne prihvata driver
	       
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.close();
	        driver.quit();
	    }


}
