package Selenium4_21_09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	/*
	 Zadatak 3) Otici na sajt demoqa, kliknuti na Elements, kliknuti na Text Box,
	  popuniti podatke i kliknuti na Submit. Sa leve strane kliknuti na Checkbox. 
	  Cekirati samo "Desktop" i utvrditi da je samo taj checkbox cekira. 
	  Kliknuti na Radio Button sa leve strane, kliknuti na "Yes" pa na "Impressive" i 
	  utvrditi da se radio button promenio.	
	 */
		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/register");
		
		WebElement elementsButton=driver.findElement(By.className("header-text"));
		elementsButton.click();
		Thread.sleep(2000);
		WebElement textBox=driver.findElement(By.className("text"));
		textBox.click();
		Thread.sleep(2000);
		
		WebElement fullName=driver.findElement(By.id("userName"));
		fullName.clear();
		fullName.sendKeys("Jelena");
		Thread.sleep(1000);
		
		WebElement userEmail=driver.findElement(By.id("userEmail"));
		userEmail.clear();
		userEmail.sendKeys("dabe07@gmail.com");
		Thread.sleep(1000);
		
		
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.clear();
		currentAddress.sendKeys("dabe07");
		Thread.sleep(1000);
		
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		permanentAddress.clear();
		permanentAddress.sendKeys("MisIMacka07");
		
		Thread.sleep(1000);
		
		WebElement submit =driver.findElement(By.id("submit"));
		
		//scroll :
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
		submit.click();
		Thread.sleep(500); 
		
		WebElement checkbox=driver.findElement(By.id("item-1"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
		checkbox.click();
		
		WebElement strelica=driver.findElement(By.cssSelector(".rct-collapse.rct-collapse-btn"));
		strelica.click();
		
		Thread.sleep(2000);
//		WebElement checkDesktop=driver.findElement(By.cssSelector(".rct-icon.rct-icon-parent-close"));
//				//rct-node.rct-node-parent.rct-node-collapsed"));
//				//+ "rct-title"));
//		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkDesktop);
//		checkDesktop.click();
		
		///--------
		//domaci:
//		cekirati samo "Desktop"
		WebElement desktop = driver.findElement(By.cssSelector(".rct-icon.rct-icon-parent-close"));
		Thread.sleep(2000);
		desktop.click();
		Thread.sleep(2000);
		
//		utvrditi da je samo taj checkbox cekiran
		WebElement success = driver.findElement(By.id("result"));
		Thread.sleep(2000);
		
		String rezultat = success.getText();
		
		if(rezultat.contains("You have selected :")) {
			System.out.println("Desktop je odabran.");
		} else {
			System.out.println("Desktop nije odabran.");
		}
		
		
//		Kliknuti na Radio Button sa leve strane 
		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
		Thread.sleep(2000);
		radioButton.click();
		Thread.sleep(2000);
		
//		kliknuti na "Yes"
		WebElement yes = driver.findElement(By.className("custom-control-label"));
		Thread.sleep(2000);
		yes.click();
		Thread.sleep(2000);
		
		WebElement da = driver.findElement(By.className("text-success"));
		Thread.sleep(2000);
		
		if(da.isDisplayed()) {
			System.out.println("Odabrano je yes.");
		} else {
			System.out.println("Nije odabrano yes");
		}
		
//		kliknuti na "Impressive"
		WebElement impressive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]"));
		Thread.sleep(2000);
		impressive.click();
		Thread.sleep(2000);
		
//		utvrditi da se radio button promenio
		WebElement impresivno = driver.findElement(By.className("text-success"));
		Thread.sleep(2000);
		
		if(impresivno.isDisplayed()) {
			System.out.println("Odabrano je impressive.");
		} else {
			System.out.println("Nije odabrano impressive");
		}
		
		driver.close();
		
	}


		
		
		
		
		
		
		
		
		
		
//		WebElement rezultat=driver.findElement(By.id("result"));
//		
//		
//		String desktopcekiran= rezultat.getText();
//		System.out.println(rezultat);
//		
//		//if(desktop.contains(""));
//		
//		
//		
		
//		
//		WebElement submit=driver.findElement(By.cssSelector(".btn.btn-primary"));
//				//By.id("submit"));
//		submit.click();
		
			
}
	

