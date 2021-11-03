package Selenium3_20_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogovanjeIProvera {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("tomsmith");
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("SuperSecretPassword!");
		
		WebElement logIn=driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
		logIn.click();
		
		WebElement test=driver.findElement(By.xpath("/html/body/div[1]/div/div"));
		String test01= test.getText();
		System.out.println(test01);
		
		if (test01.contains("You logged into a secure area!")) {
			System.out.println("Uspesno ste se ulogvali");
		} else {
			System.out.println("Nije uspesno logovanje");
		}
		
	
		
		driver.close();
		
		
	}

}
