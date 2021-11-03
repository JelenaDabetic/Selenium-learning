package poslednjiTestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogedInPagePT {
	
	 WebDriver driver;
	    WebElement logOutButton;
	    WebElement galaxyS7;
	    WebElement galaxyS6;
	    WebElement laptop;
	    WebElement macBookAir;

	    public LogedInPagePT (WebDriver driver) {
	        this.driver = driver;
	    }

	    public WebElement getLogOutButton() {
	        return driver.findElement(By.id("logout2"));
	    }

	    public WebElement getGalaxyS6() {
	        return driver.findElement(By.className("hrefch"));
	    }
	    public WebElement getLaptop() {
	    	return driver.findElement(By.id("itemc"));
	    }
	    public WebElement getMacBookAir() {
	        return driver.findElement(By.id("/html/body/div[5]/div/div[2]/div/div[3]/div/div/h4/a"));
	    }
	    
	    
	    public String logOutButtonText() {
	        return getLogOutButton().getText();
	    }
	    
	    public void clickOnLaptop() {
	    	this.getLaptop().click();
	    }
	    
	    public void clickOnMacBook() {
	    	this.getLaptop().click();
	    }
	    
	    
	    public WebElement getGalaxyS7() {
	        return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[4]/div/div/h4/a"));
	    }
	    
	    public void chooseGalaxyS7() {
	    	this.getGalaxyS7().click();
	    }
	    
	    
}
