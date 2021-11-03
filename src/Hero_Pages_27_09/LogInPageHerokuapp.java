package Hero_Pages_27_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageHerokuapp {
	
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement logInButton;
	
	public LogInPageHerokuapp (WebDriver driver) {
		super();
		this.driver=driver;
	}

	public WebElement getUsername() {
		return  driver.findElement(By.id("username")) ;
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("password")) ;
	}

	public WebElement getLogInButton() {
		return driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")) ;
	}
	

	public void insertUsername(String usernameData) {
        this.getUsername().clear();
        this.getUsername().sendKeys(usernameData);
    }

    public void insertPassword(String passwordData) {
        this.getPassword().clear();
        this.getPassword().sendKeys(passwordData);
    }
    
    public void clickLogInButton(String logInButtonText) {
		this.logInButton.click();

	}

}
