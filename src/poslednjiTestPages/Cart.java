package poslednjiTestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

	
	WebDriver driver;
    WebElement deleteButton;
    WebElement nameOftheItemPhone;
    
    public Cart (WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement getDeleteButton() {
    	return driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a"));
    }
    
    public WebElement getNameOftheItemPhone() {
    	return driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[2]"));
    }
    public void ClickDelete() {
    	this.getDeleteButton().click();
    }
    
    
}
