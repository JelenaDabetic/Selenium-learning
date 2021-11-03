package Selenium2_17_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_korpa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
			
			WebDriver driver=new ChromeDriver();
			
			driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
			
			WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
			addToCart.click();
		
			
			WebElement cart = driver.findElement(By.id("nav-cart"));
			cart.click();
			
			
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.id("delete"));
			delete.click();
			
			
			
			cart.click();
			
			WebElement emptyCart=driver.findElement(By.id("sc-empty-cart-message"));
			
			
		
//			
//			if(poruka.equals(emptyCart)) {
//				System.out.println("prazna je korpa");
//			}
			
			Thread.sleep(2000);
			
			
			
			driver.close();
		
		
	}

}
