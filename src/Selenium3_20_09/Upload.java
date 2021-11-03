package Selenium3_20_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		Thread.sleep(2000);
		//chooseFile.click();
		//chooseFile.sendKeys("/Users/jelenadabetic/Desktop/suspicious-dog.jpg");
		
		
		
		
		WebElement uploadButton=driver.findElement(By.id("file-submit"));
		uploadButton.click();
		
		
		WebElement test=driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
		String test01= test.getText();
		System.out.println(test01);
		
		
		
		
		
		
		
//		String failLink ="https://the-internet.herokuapp.com/upload";
//		String link ="https://the-internet.herokuapp.com/upload";
//		
//	
		
		
		WebElement failUpload=driver.findElement(By.xpath("/html/body/h1"));
		String failM= failUpload.getText();
		System.out.println(failM);
		
		if (failM.contains("Internal Server Error")) {
			System.out.println("FAILURE");
			
		} else {
			System.out.println("PASS");
		}
	
		
		
		
		
//		if (endLink.equals(link)) {
//			System.out.println("Pass");
//			
//		} else {
//			System.out.println("FAILURE");
//		}
		//driver.close();
		
	}

}
