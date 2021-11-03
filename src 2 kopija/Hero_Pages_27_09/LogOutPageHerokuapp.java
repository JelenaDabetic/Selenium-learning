package Hero_Pages_27_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPageHerokuapp {
	

    WebDriver driver;
    WebElement logOutButton;

    public LogOutPageHerokuapp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.cssSelector("icon-2x icon-signout"));
    }
    
    public void clickOnLogOutButton() {
    	this.logOutButton.click();
    	
    }

    public logOutTextButton(String)
    String dobijenNaslov = firstHeading.getText();

}
