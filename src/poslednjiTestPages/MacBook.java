package poslednjiTestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MacBook {
	
	WebDriver driver;
	WebElement nameOfItemMack;
	WebElement addToCart;
	
	
	public WebElement getNameOfItemMack() {
		return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/h2"));
	}
	public WebElement getAddToCart() {
		return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
	}
	

	
	
}
