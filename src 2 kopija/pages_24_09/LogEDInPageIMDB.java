package pages_24_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogEDInPageIMDB {

	WebDriver driver;
	WebElement watchListbutton;
	WebElement editButton;
	
	
	
	
	
	public LogEDInPageIMDB (WebDriver driver){
		this.driver=driver;
	}
	
	
	public WebElement getEditButton() {
		return driver.findElement(By.className("button"));
	}
	public WebElement getWatchListbutton() {
		return driver.findElement(By.className("ipc-button__text"));
	}
	
	public void ClickWatchListbutton() {
		this.getWatchListbutton().click();
	
	}
	
}
