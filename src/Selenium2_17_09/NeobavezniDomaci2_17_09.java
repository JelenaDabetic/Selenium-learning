package Selenium2_17_09;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeobavezniDomaci2_17_09 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		Ko hoce malo da vezba dodatno moze da uradi ovo:
			Uloguj se na wordpress preko dodavanja kolacica i proveri da li se ulogovao na pravi nalog
			Napomena: Kao i za polje sto radimo prvo "clear" treba da obrisemo sve cookies za slucaj da je ostao neki nepozeljni
	*/
		
		
System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		String username="dabe07";
		
		driver.manage().deleteAllCookies();   
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		Cookie loginCookie = new Cookie("wordpress_logged_in", "dabe07%7C1726509504%7ChuMQZsVvgCw4JUvqRitHp2zZYE480AHarYt5jUwXnOf%7C2b090b700f7bc86c98611c44f44aa07688e4c9c38969b394957b44d036cfb62c");
		driver.manage().addCookie(loginCookie);
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		WebElement dugmeContinue = driver.findElement(By.cssSelector(".button.is-primary"));
		dugmeContinue.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		WebElement myAccount=driver.findElement(By.className("gravatar"));
		myAccount.click();
		
		WebElement firstName=driver.findElement(By.id("first_name"));
		String firstName01= firstName.getText();
		
		WebElement lastName=driver.findElement(By.id("last_name"));
		String lastName01= lastName.getText();
		
		System.out.println(firstName);
	
		
		if(firstName.equals("Jelena") && lastName.equals("Dabetic")) {
			System.out.println("Ulogovani ste na pravi nalog");
		}else {
		System.out.println("Ulogovani ste na POGRESAN nalog");
		}	
		
		driver.close();
		
		}
	}
