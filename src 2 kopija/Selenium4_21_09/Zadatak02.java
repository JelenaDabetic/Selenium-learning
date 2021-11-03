package Selenium4_21_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*
 Zadatak 2) Otici na ovaj sajt: https://www.ctshop.rs/
Ugasiti popup i ispisati u konzoli da je popup ugasen	

	Ne koristiti thread sleep vec web driver wait
 */
		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
//		
//		//--------------
//		driver.navigate().to("https://www.ctshop.rs/");
//		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		WebElement popUp= driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/div/div/div/div[2]/div/div[1]"));
//		Thread.sleep(2000);
//		WebElement xButton=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/div/div/div/div[1]/a"));
//		Thread.sleep(2000);
//		xButton.click();
//		
//		Boolean provera=popUp.isDisplayed();
//		
//		if (provera==true) {
//			System.out.println("Pop-up prozor NIJE zatvoren");
//		} else {
//			System.out.println("Pop-up prozor JESTE zatvoren");
//		}
//		///---------------
		
		//Dragoljubovo resenje:
		
		driver.navigate().to("https://www.ctshop.rs/");
        WebDriverWait wdwait = new WebDriverWait(driver, 10);

        wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".soundest-form-background-image-content-inner.soundest-form-background-image")));
        WebElement popup = driver.findElement(By.cssSelector(".soundest-form-background-image-content-inner.soundest-form-background-image"));
        if (popup.isDisplayed()) {
            System.out.println("Popup je prikazan");
        } else {
            System.out.println("Popup nije prikazan");
        }

        WebElement popupClose = driver.findElement(By.className("soundest-form-background-image-close"));
        popupClose.click();

        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".soundest-form-background-image.soundest-form-present.soundest-form-background-image-hidden")));
        WebElement popup1 = driver.findElement(By.cssSelector(".soundest-form-background-image.soundest-form-present.soundest-form-background-image-hidden"));
        if (popup1.isEnabled()) {
            System.out.println("Popup nije prikazan");
        } else {
            System.out.println("Popup je prikazan");
        }
    }

		
		
		
		
	}


