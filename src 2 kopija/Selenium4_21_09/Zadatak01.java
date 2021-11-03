package Selenium4_21_09;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 Zadatak 1) Pokrenuti program koji ce otvoriti 4 taba, 
		 na svakom tabu otici na neku web stranicu. Nakon toga redom zatvarati svaki tab. 
		 Napraviti thread sleep od 2 sekunde izmedju zatvaranja svakog taba.
		 */
		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		

		Thread.sleep(2000);
		
		ArrayList<String > listaTabova = new ArrayList<String> (driver.getWindowHandles());
		
//		driver.close();
//		Thread.sleep(1000);
//		driver.close();
////		driver.switchTo().window(listaTabova.get(0));
////		Thread.sleep
		
		
//		driver.get("https://www.lepotaizdravlje.rs/");
//		driver.get("https://www.youtube.com/");
//		driver.get("https://www.urbangarden.rs/kategorija-proizvoda/sobne-ili-enterijerske-biljke/");
//		driver.get("https://www.jjzmaj.rs/");
		
		
		driver.switchTo().window(listaTabova.get(1)).get("https://www.lepotaizdravlje.rs/"); //close();
		driver.switchTo().window(listaTabova.get(2)).get("https://www.youtube.com/");  
		driver.switchTo().window(listaTabova.get(3)).get("https://www.urbangarden.rs/kategorija-proizvoda/sobne-ili-enterijerske-biljke/");
		driver.switchTo().window(listaTabova.get(4)).get("https://www.jjzmaj.rs/");
		
		Thread.sleep(2000);
		driver.switchTo().window(listaTabova.get(0)).close();
		Thread.sleep(2000);
		driver.switchTo().window(listaTabova.get(1)).close();
		Thread.sleep(2000);
		driver.switchTo().window(listaTabova.get(2)).close();
		Thread.sleep(2000);
		driver.switchTo().window(listaTabova.get(3)).close();
		Thread.sleep(2000);
		driver.switchTo().window(listaTabova.get(4)).close();
	//------------------------------------	
		for (int i=0; i<listaTabova.size(); i++) {
			driver.switchTo().window(listaTabova.get(i));
			Thread.sleep(2000);
			driver.close();
		}

		
		
	}

}
