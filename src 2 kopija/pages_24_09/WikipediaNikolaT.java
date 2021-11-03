package pages_24_09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WikipediaNikolaT {
	

	WebDriver driver;
	WebElement searchBox;
	WebElement firstHeadingOnTeslaWikiPage;
	
	public String ocekivaniPrviNaslov  ="Nikola Tesla" ;

	

	public WikipediaNikolaT(WebDriver driver) {
		super();
		this.driver = driver;
		this.searchBox = searchBox;
	}

	public WebElement getTexBox() {
		return  driver.findElement(By.id("searchInput")) ;
	}
	
	public WebElement getFirstHeadingOnTeslaWikiPage() {
		return  driver.findElement(By.id("firstHeading"));
	}

	public void UnosTekstaNikolaTesla() {
        this.getTexBox().clear();
        this.getTexBox().sendKeys("Nikola Tesla");
        this.getTexBox().sendKeys(Keys.ENTER);
    }
	
	public void ProveraNaslovaNaDobijenojStranici() {
		
		String prviNaslov=this.getFirstHeadingOnTeslaWikiPage().getText();
		Assert.assertEquals(this.ocekivaniPrviNaslov, prviNaslov);
	}


	
}
