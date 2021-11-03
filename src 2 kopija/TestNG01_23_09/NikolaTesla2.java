package TestNG01_23_09;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class NikolaTesla2 {
	

	/*
	 Zadatak 2) Koristeci TestNG napraviti 2 testa. 
	 Jedan je otici na Google i otkucati Nikola Tesla i testirati da li 
	 se prvo pojavljuje stranica sa wikipedije, a drugi test je otici 
	 na wikipedia stranicu, otkucati Nikola Tesla i testirati da li se 
	 otvorio clanak o Nikoli Tesli. Koristiti BeforeMethod, BeforeClass, 
	 Test, AfterMethod, AfterClass
	 */
	
	
	@BeforeClass
		public void setovanjeWebDrivera() {
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
			WebDriver driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void otvaranjeGoogleStranice() {
		WebDriver driver;
		driver.navigate().to("https://www.google.com/");
	}
	
	
	@Test
	public void nikolaTeslaWikipedia1() {
		
		WebDriver driver;
		WebElement elementSearch = driver.findElement((SearchContext) By.className("RNNXgb"));
		elementSearch.clear();
		elementSearch.sendKeys("Nikola Tesla");
		WebElement firstHeading =driver.findElement((SearchContext) By.cssSelector(".LC20lb.DKV0Md"));
		
		String dobijenNaslov = firstHeading.getText();
		String ocekivanNaslov = "Nikola Tesla";
		Assert.assertEquals(ocekivanNaslov, dobijenNaslov);
	
		
		//Kako koristiti asert za proveru naslova: ima u Dragoljubovom resenju
//		String dobijenNaslov = firstHeading.getText();
//		String ocekivanNaslov = "Nikola Tesla";
//		Assert.assertEquals(ocekivanNaslov, dobijenNaslov);
	
//		driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div/form/div/input[1]")).sendKeys("Wikipedia");
//		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div/form/div/input[1]")).click();
//		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div/form/div/input[1]")).sendKeys(Keys.ENTER);
//		driver.close();
//	}
//	
	@AfterMethod
	public void testQuit() {
		driver.close();
	}
	
	@AfterClass
	public void testQyit() {
		driver.quit;
	}
	
	
	/* Dragoljubovo resenje:
	 package SeleniumOsnove;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NikolaTeslaTestNG {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
    
    ///ovde mora nas setup: System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
        ne ovaj WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void driverSetUp() {
        driver.manage().window().maximize();
    }

    @Test (priority = 10)
    public void testGoogle() {
        driver.navigate().to("https://www.google.com");
        WebElement searchBox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
        searchBox.clear();
        searchBox.sendKeys("Nikola Tesla");
        searchBox.sendKeys(Keys.ENTER);
        WebElement firstText = driver.findElement(By.cssSelector(".LC20lb.DKV0Md"));
        String dobijeniPrviRezultat = firstText.getText();
        //System.out.println(dobijeniPrviRezultat);
        //String ocekivaniPrviRezultat = "Никола Тесла - Википедија";
        Assert.assertEquals(dobijeniPrviRezultat, "Никола Тесла - Википедија");
        //Prvo ide actual result pa expected result za Assert
    }
    
    @Test (priority = 20)
    public void testWikipedia() {
        driver.navigate().to("https://www.wikipedia.org");
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.clear();
        searchBox.sendKeys("Nikola Tesla");
        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive"));
        searchButton.click();
        WebElement firstHeading = driver.findElement(By.id("firstHeading"));
        String dobijenNaslov = firstHeading.getText();
        String ocekivanNaslov = "Nikola Tesla";
        Assert.assertEquals(dobijenNaslov, ocekivanNaslov);
    }

    @AfterClass
    public void finishTestRun() {
        driver.close();
        driver.quit();
    }

}
	 */
	
	
}
