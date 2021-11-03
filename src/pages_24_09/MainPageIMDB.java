package pages_24_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageIMDB {
	
	WebDriver driver;
	WebElement signInButton;
	

	public MainPageIMDB(WebDriver driver) {
		super();
		this.driver = driver;
	}





	public WebElement getSignInButton() {
		return driver.findElement(By.xpath("/html/body/div[2]/nav/div[2]/div[5]/a/div"));
	}
	
	public void SignInMain() {
		this.signInButton.click();
		
	}
	
//
//	public WebElement getUsername() {
//		return  driver.findElement(By.id("username")) ;
//	}

}
