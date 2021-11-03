package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2_ostatak_sa_casa_Idomaci {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		//------domaci 16.09.
		/*
		 Domaci zadatak:
Napisati program koji ucitava https://practicetestautomation.com/ stranicu, 
klikne na "Practice" i klikne na "Test login page", popunjava username i password (student/Password123), 
loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout. Na kraju zatvoriti program.

Koristite sto manje xpath mozete, pre unosa u polje odradite akciju clear i kreirajte web elemente za svaki element koji trazite.
		 */
		
		
		driver.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
	
		WebElement practiceButton_menuItem = driver.findElement(By.id("menu-item-20"));
		Thread.sleep(2000);
		practiceButton_menuItem.click();
		WebElement testLoginPage = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[1]/div[1]"));
		testLoginPage.click();
		
		
/*		
		 --- Tesla sa casa
		 
		 WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.wikipedia.org/");
Thread.sleep(2000);

WebElement searchBox = driver.findElement(By.id("searchInput"));
Thread.sleep(2000);
searchBox.clear();
Thread.sleep(2000);
searchBox.sendKeys("Nikola Tesla");
Thread.sleep(2000);
//WebElement randomButton = driver.findElement(By.className("styled-select-active-helper"));
WebElement searchButton = driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive"));
Thread.sleep(2000);
searchButton.click();
Thread.sleep(2000);
WebElement naslov = driver.findElement(By.id("firstHeading"));
Thread.sleep(2000);
String dobijenNaslov = naslov.getText();
Thread.sleep(2000);
String ispravanNaslov = "Nikola Tesla";
Thread.sleep(2000);

Assert.assertEquals(ispravanNaslov, dobijenNaslov);

driver.close();
		 */
		
		
		
		/*
		 ---- katalon shop 
		 
		 WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://cms.demo.katalon.com/");

WebElement patientNinja = driver.findElement(By.cssSelector(".product.type-product.post-66.status-publish.last.instock.product_cat-clothing.product_cat-hoodies.has-post-thumbnail.taxable.shipping-taxable.purchasable.product-type-simple"));
patientNinja.click();

WebElement submitButton = driver.findElement(By.name("add-to-cart"));
submitButton.click();

//Los primer provere korpe
WebElement notification = driver.findElement(By.className("woocommerce-message"));
String message = notification.getText();
notification.isDisplayed();
//Los primer provere korpe


WebElement cartButton = driver.findElement(By.cssSelector(".page_item.page-item-8"));
cartButton.click();
WebElement productName = driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
String ime = productName.getText();

Assert.assertEquals("Patient Ninja", ime);
		 */
		

	}

}
