package Selenium2_17_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slika {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://imgflip.com/memegenerator");
		
//		WebElement addImage= driver.findElement(By.cssSelector(".mm-add-img.l.but.sml"));
//		addImage.click();
		
		Thread.sleep(2000);
		WebElement uploadTemplate= driver.findElement(By.id("mm-show-upload"));
		uploadTemplate.click();
		
		WebDriverWait wdwait = new WebDriverWait(driver, 25);
		WebElement uploadFromPc= driver.findElement(By.id("mm-upload-file-btn"));
		
		Thread.sleep(2000);
		//wdwait.until(ExpectedConditions.elementToBeClickable(By.className("mm-upload-file-btn")));
		uploadFromPc.click();
//		
		WebElement dugme = driver.findElement(By.id("mm-upload-file"));
		Thread.sleep(2000);
		dugme.sendKeys("/Users/jelenadabetic/Desktop/suspicious-dog.jpg");
		
		WebElement upload= driver.findElement(By.id("mm-upload-btn"));
		upload.click();
		Thread.sleep(2000);
		WebElement insertTextTop= driver.findElement(By.className("mm-text"));
		insertTextTop.clear();
		insertTextTop.sendKeys("What if I told you QA is here to help");
		Thread.sleep(2000);
		WebElement genereteMeme=driver.findElement(By.cssSelector(".mm-generate.b.but"));
		genereteMeme.click();
		
//		WebElement topText = driver.findElement(By.className("mm-upload-btn"));
//		topText.clear();
//		topText.sendKeys("What if I told you QA is here to help");
		
//		
//		WebElement generateMeme = driver.findElement(By.cssSelector(".mm-generate.b.but"));
//		generateMeme.click();
		
//		WebElement dugme = driver.findElement(By.id("mm-upload-file"));
//		Thread.sleep(2000);
//		dugme.sendKeys("C:\\Users\\drago\\OneDrive\\Desktop\\max.jpg");
//		mm-add-img-submit.b.but
		
		

	}

}
