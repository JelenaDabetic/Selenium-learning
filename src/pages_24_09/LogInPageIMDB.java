package pages_24_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageIMDB {
	
	WebDriver driver;
	
	WebElement email;
	WebElement password;
	WebElement sign_in;
	
	public LogInPageIMDB (WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(By.id("ap_email"));
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.id("ap_password"));
		
	}

	public WebElement getSign_in() {
		return driver.findElement(By.id("signInSubmit"));

	}
	

	
	public void insertEmail(String emailData) {
        this.getEmail().clear();
        this.getEmail().sendKeys(emailData);
    }

    public void insertPassword(String passwordData) {
        this.getPassword().clear();
        this.getPassword().sendKeys(passwordData);
    }

    public void clickSubmitButton() {
        this.getSign_in().click();
    }
	
	

}
