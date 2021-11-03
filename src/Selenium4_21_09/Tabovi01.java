package Selenium4_21_09;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabovi01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//Komanda za otvaranje tabova:
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		js.executeScript("window.open()");
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com");
		
		//driver.getWindowHandles();
		
		//kreiranje liste svih otvorenih tabova:
		ArrayList<String > listaTabova = new ArrayList<String> (driver.getWindowHandles());
		
		
		//Prebacivanje na tab sa indexom 2:
		driver.switchTo().window(listaTabova.get(2));
		
		
		
		
	}

}
