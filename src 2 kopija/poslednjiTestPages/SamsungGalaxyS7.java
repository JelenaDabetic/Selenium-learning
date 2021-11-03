package poslednjiTestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamsungGalaxyS7 {
	
	WebDriver driver;
    WebElement phoneName;
    WebElement addToCartButton;
    WebElement cart;
    
    

    public SamsungGalaxyS7 (WebDriver driver) {
        this.driver = driver;
    }

	public WebElement getPhoneName() {
		return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/h2"));
	}
    
    public WebElement getAddToCartButton() {
    	return driver.findElement(By.cssSelector(".btn.btn-success.btn-lg"));
    }

    public WebElement getCart() {
    	return driver.findElement(By.id("cartur"));

    }
    
    public void AddGalaxyS7() {
    	this.getAddToCartButton().click();
    	
    }
    
    public void CheckQuantityInCart() {
    	this.getAddToCartButton().getText();
    }
    
    public void phoneNameText() {
    	this.getPhoneName().getText();
    }
}
