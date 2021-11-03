package Selenium3_20_09;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInScanner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		Scanner s= new Scanner(System.in);
		System.out.println("Unesite svoj username:");
		String usernameU= s.nextLine();
		
		System.out.println("Unesite svoj password: ");
		String passwordU =s.nextLine();

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
		WebElement username  = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		username.clear();
		username.sendKeys(usernameU);
		
		Thread.sleep(2000);
		
		WebElement password  = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		password.clear();
		password.sendKeys(passwordU);
		
		WebElement logIn = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
		logIn.click();
		
		
		
	}

}
