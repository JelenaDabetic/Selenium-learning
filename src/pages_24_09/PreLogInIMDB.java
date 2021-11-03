package pages_24_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreLogInIMDB {
	
			WebDriver driver;
			WebElement signInWithIMDb;

	    public PreLogInIMDB (WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public WebElement getSignInWithIMDb () {
	    	return driver.findElement(By.className("auth-provider-text"));
	    }
	   
	    
	    public void SignInWithIMDB() {
	    	this.getSignInWithIMDb().click();
	    }

}
