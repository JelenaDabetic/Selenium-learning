package Selenium2_17_09;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2_17_09 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		WebElement emailOrUsername=  driver.findElement(By.id("usernameOrEmail"));
		
		Thread.sleep(1000);
		emailOrUsername.clear();
		emailOrUsername.click();
		emailOrUsername.sendKeys("dabe07");
		Thread.sleep(1000);
		
		WebElement dugmeContinue= driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/main/div/div/form/div[1]/div[2]/button"));
		dugmeContinue.click();
		
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(1000);
		password.clear();
		password.sendKeys("MisIMacka07");
		Thread.sleep(1000);
		
		WebElement logIn= driver.findElement(By.cssSelector(".button.form-button.is-primary"));
		Thread.sleep(2000);
		logIn.click();
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.manage().deleteCookieNamed("wordpress_logged_in");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		Cookie kolac = new Cookie("Jelena", "je dodala kolac");
		
		
		//driver.close();
		
		
		

				
	}

}
