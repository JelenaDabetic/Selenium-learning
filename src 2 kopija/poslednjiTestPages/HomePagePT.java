package poslednjiTestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePT {

	
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement logInButton;
	WebElement logInButton2;
	
	WebElement usernameText;
	public WebDriverWait wdwait;
	
	public HomePagePT (WebDriver driver) {
		super();
		this.driver=driver;
	}
	
	public WebElement getLogInButton() {
		return driver.findElement(By.id("login2"));
	}

	public WebElement getUsername() {
		return  driver.findElement(By.id("loginusername")) ;
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("loginpassword")) ;
	}
	
	public WebElement getLogInButton2() {
		return driver.findElement(By.cssSelector(".btn.btn-primary"));
	}
	
	public WebElement getUsernameText(String usernameText) {
		return driver.findElement(By.id("nameofuser"));
	}

	public void insertUsername(String usernameData) {
        this.getUsername().clear();
        this.getUsername().sendKeys(usernameData);
    }
	
	
	public void insertPassword(String passwordData) {
        this.getUsername().clear();
        this.getUsername().sendKeys(passwordData);
    }
	
	
	
	public void clickLoginButton1 () {
		this.getLogInButton().click();
		
	}
	
	public void clickLoginButton2 () {
		this.getLogInButton2().click();
	
	}
	
	public void clickLogInButton(String logInButtonText) {
		this.logInButton.click();

	}
	
	public void clickLogInButton2(String logInButtonText) {
		this.logInButton2.click();

	}
	public String LogInButtonText() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("error")));
        return getLogInButton().getText();
   }
	
//	public String SuccessfulLogInTextUsername() {
//		return getUsernameText.getText()
//	}
}
