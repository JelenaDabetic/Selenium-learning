package Selenium2_17_09;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeobavezniDomaci_17_09 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
		Neobavezni domaci ( okacite na drive):
			Pomocu jave i seleniuma
			Otvoriti novi prozor u pretrazivacu i otici na stranicu  IT Bootcamp-a
			Primeniti metode- get URL i Title, navigate - refresh, to, back, forward
			U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na 
			prvobitnu velicinu (hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )
			Dokazati da li prilikom koriscenja reci “testiranje” u search-u (i trazanja jelte) 
			dobijamo rezultat shodno trazenom tako sto cete napraviti screenshot stranice. nakon pretrage.
			Proveriti da li bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu.
*/
		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");

		String url = "https://itbootcamp.rs/";
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to(url);
		driver.get(url);
		
		Dimension dimenzijePocetne = driver.manage().window().getSize();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
    	 	Thread.sleep(2000);
     
    
    	 
    	 System.out.println("Page title is : " + driver.getTitle());
    	 
    	 WebElement searchButton= driver.findElement(By.className("open-search"));
    	 searchButton.click();
    	 
    	 WebElement textBox=driver.findElement(By.className("form-control"));
    	 textBox.clear();
    	 String textBox01 =textBox.getText();
    	 	Thread.sleep(1000);
    	 textBox.click();
    	 textBox.sendKeys("testiranje");
    	 textBox.sendKeys(Keys.ENTER);
    	 	Thread.sleep(2000);
    	 
    	 WebElement textBoxAfter=driver.findElement(By.className("form-control"));
    	 String textBoxAfter01=textBoxAfter.getText();
    	 
    	 WebElement rezultatPretreageNaslov =driver.findElement(By.xpath("/html/body/div/div[2]/div/section/main/article[1]/figure/figcaption/header/h2/a"));
    	 String rezultatipretrage01= rezultatPretreageNaslov.getText();
    	 Thread.sleep(2000);
    	 
    	 
    	 if (rezultatipretrage01.toLowerCase().contains("testiranje")) {
    		 System.out.println("Dobija se ocekivanj rezultat pretrage");
    	 } else {
    		 System.out.println("NE dobija se ocekivanj rezultat pretrage");
    	 }
     
    	 
    	 WebElement buttonKontakt=driver.findElement(By.id("menu-item-4141"));
    	 buttonKontakt.click();
    	 
    	 String kontaktUrl= driver.getCurrentUrl();
    	  if(kontaktUrl.equals(url)) {
    		  System.out.println("Fail - stranica kontakt i pocetna stranica imaju istu adresu");
    		  
    	  }else {
    		  System.out.println("Pass - stranica kontakt i pocetna stranica  NEMAJU istu adresu");
    		  
    	  }
    	  Thread.sleep(2000);
    	  
    	  driver.navigate().back();
  		driver.navigate().forward();


    	  
    	 Thread.sleep(2000);
    	 driver.manage().window().setSize(dimenzijePocetne);
    	 Thread.sleep(4000);
    	 driver.close();
    	       
		  
    	 
    	 
    	
		
	
		

		
		
	}
	
//	//nisam ubacila externe jar fajlove neophodne za ovo, stoga nisam uradila na ovaj nacin nego preko if-a
//	 public void TakeScreenShot() throws Exception{
//
//			WebDriver driver ;
//			System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
//	    	driver = new ChromeDriver();
//
//	        //goto url
//
//	        driver.get("https://itbootcamp.rs/");
//
//	        //Call take screenshot function
//
//	        this.takeSnapShot(driver, "/Users/jelenadabetic/Desktop/QA it boot camp/QA domaci zadaci/17.09.2021.neobavezni/screenshot") ;     
//
//	    }
//
//
//	private void takeSnapShot(WebDriver driver, String string) {
//		// TODO Auto-generated method stub
//		
//	}

	

	}



