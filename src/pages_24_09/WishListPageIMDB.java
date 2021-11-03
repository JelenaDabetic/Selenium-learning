package pages_24_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WishListPageIMDB {
	
	WebDriver driver;

	WebElement preTestTitles;
	WebElement duringTestTitles;
	WebElement afterTestTitles;
	WebElement editButton;
	WebElement addNewItem;
	WebElement choosingFirstOnList;
	WebElement checkOfTheMovie;
	WebElement deleteItem;
	
	
	public  WishListPageIMDB (WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEditButton() {
		return driver.findElement(By.className("button"));
	}
	
	public WebElement getPreTestTitles() {
		return driver.findElement(By.className("lister-details"));
	}
	
	public WebElement getDuringTestTitles() {
		return driver.findElement(By.className("lister-details"));
	}
	
	public WebElement getAfterTestTitles() {
		return driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/span"));
	}
	
	
	public WebElement getAddNewItem(){
		return driver.findElement(By.id("add-to-list-search"));
		
	}
	
	
	public WebElement getChoosingFirstOnList(){
		return driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div[1]/div[2]/div[5]/div/span[2]/div/a[1]"));
	}
	
	public WebElement getCheckOfTheMovie() {
		return driver.findElement(By.id("2099894734"));
	}
	
	
	public WebElement getDeleteItem() {
		return driver.findElement(By.id("delete_items"));
	}
	
	
	

	public void PreTestTitles01() {
		
		String firstItem=this.getPreTestTitles().getText();
	
	}
	
	public void DuringTestTitles01() {
		String secondItem= this.getDuringTestTitles().getText();
	}
	
	public void ClickOnEdit() {
		this.getEditButton().click();
	}
	
	public void AddNewMovie() {
		this.getAddNewItem().clear();
		this.getAddNewItem().sendKeys("Money Heist (2017)");
		this.getChoosingFirstOnList().click();
	}
	

	public void PostTestTitles01() {
		
		String thirdItem=this.getAfterTestTitles().getText();
	}
	
	public void ComapringPreTestAndDuringTestTitles() {
		String secondItem= this.getDuringTestTitles().getText();
		String firstItem=this.getPreTestTitles().getText();
		Assert.assertNotEquals(secondItem,firstItem);
	}
	
	public void DeletingMovieFromList() {
		this.getEditButton().click();
		this.getCheckOfTheMovie().click();
		
		
	}
	
	public void ComapringDuringTestAndAfterTestTitles() {
		String secondItem= this.getDuringTestTitles().getText();
		 String thirdItem=this.getAfterTestTitles().getText();
		Assert.assertNotEquals(thirdItem,secondItem);
	}

}
