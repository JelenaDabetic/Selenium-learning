package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci_16_09 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		//------domaci 16.09.
		/*
		 Domaci zadatak:
Napisati program koji ucitava https://practicetestautomation.com/ stranicu, 
klikne na "Practice" i klikne na "Test login page", popunjava username i password (student/Password123), 
loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout. Na kraju zatvoriti program.

Koristite sto manje xpath mozete, pre unosa u polje odradite akciju clear i kreirajte web elemente za svaki element koji trazite.
		 */
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(1000);
	
		WebElement practiceButton_menuItem = driver.findElement(By.id("menu-item-20"));
		Thread.sleep(2000);
		practiceButton_menuItem.click();
		WebElement testLoginPage = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[1]/div[1]/p/a"));
		testLoginPage.click();
		
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.click();
		username.sendKeys("student");
		
		Thread.sleep(1000);
		
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.click();
		password.sendKeys("Password123");
		
		Thread.sleep(2000);
		
		WebElement submitButton= driver.findElement(By.id("submit"));
		submitButton.click();
		
		WebElement logOut = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
		logOut.click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
