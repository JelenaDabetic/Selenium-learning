package SeleniumOsnove;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
//		 driver.get("https://www.google.com");
//		
//		driver.navigate().to("https://www.youtube.com");
//		driver.manage().window().maximize();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
		
		
/*
 Zadatak 1)
Otici na stranicu Google, povecati ekran, odraditi refresh stranice, 
otici na YouTube, odraditi opet refresh i vratiti se nazad na Google.		
 */
		
//	driver.navigate().to("https://www.google.com");
//	Thread.sleep(2000);
//	driver.manage().window().maximize();
//	driver.navigate().refresh();
//	driver.navigate().to("https://www.youtube.com");
//	driver.navigate().refresh();
//	driver.navigate().back();
		
//	driver.manage().window().maximize();
//	 driver.navigate().to("https://www.google.com");
//	 Thread.sleep(2000);
//	 driver.findElement(By.xpath("/html/body/ntp-app//div/ntp-realbox//div/input"));
//	 driver.close();
	
	 
	 
//	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("itbootcamp");
//	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
//	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
	 
	 
	 //driver.findElement(By.xpath("/html/body/ntp-app//div/ntp-realbox//div/input")).sendKeys("itbootcamp");
	 
	 /*
	  Napraviti program koji otvara clanak o Nikoli Tesli na Wikipediji
	  */
	 
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div/form/div/input[1]")).sendKeys("Nikola Tesla");
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div/form/div/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div/div/form/div/input[1]")).sendKeys(Keys.ENTER);
		driver.close();
		
		WebElement searchBox = driver.findElement(By.id("searchInput"));
		searchBox.clear();
		searchBox.sendKeys("Nikola Tesla");
		
		
		//=====
		
		//WebElement = patentNinja=driver.findElement()
		
		
		
	}

}
