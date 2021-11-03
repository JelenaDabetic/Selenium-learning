package poslednjiTestTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import poslednjiTestBase.BaseTestTest;
import poslednjiTestPages.LogedInPagePT;

public class PoslednjiTTest extends BaseTestTest {
	
	@BeforeMethod
	
	public void pageSetUP() {
		driver.manage().window().maximize();
		driver.navigate().to(homeurl);
		WebDriverWait wdwait;
	}
	
	@Test (priority=10)
	public void successfulLogIn() throws InterruptedException {
//		String username= xcelReaderTest.getStringData("STest01", 1, 1);
//	    String password = xcelReaderTest.getStringData("STest01", 1, 2);
//	    
//	    String button = xcelReaderTest.getStringData("STest01", 1, 5);
//	    String text = xcelReaderTest.getStringData("STest01", 1, 7);

//	       homePagePT.insertUsername(username);
//	        homePagePT.insertPassword(password);
//	        homePagePT.clickLogInButton(button);

	   
			Thread.sleep(2000);
			homePagePT.clickLoginButton1();
	        homePagePT.insertUsername("dabe07");
	        homePagePT.insertPassword("MisIMacka07");
	        Thread.sleep(2000);
	        homePagePT.clickLoginButton2();
	       
	      
	        assertTrue(homePagePT.getLogInButton().isDisplayed());
	       
//	        assertEquals(homePagePT.LogInButtonText(), button);
//	        assertEquals(homePagePT.successfulLogInTextUsername(), text);


	        assertTrue(homePagePT.LogInButtonText().contains("LogIn"));
	}
	
	@Test (priority = 20)
    public void incorrectPassword() {
		homePagePT.clickLoginButton1();
		homePagePT.insertUsername("dabe07");
		homePagePT.insertPassword("Sifra123");
        homePagePT.clickLoginButton2();
        assertTrue(homePagePT.getLogInButton().isDisplayed());
    }
	
	@Test (priority = 30)
    public void incorrectUsername() {
		homePagePT.clickLoginButton1();
		homePagePT.insertUsername("Mica@12");
		homePagePT.insertPassword("MisIMacka07");
		homePagePT.clickLoginButton2();
		assertTrue(homePagePT.getLogInButton().isDisplayed());
    }
	
	
	@Test (priority=40)
	
	public void puttingPhoneInTheCart() {
		logedInPagePT.chooseGalaxyS7();
		
		assertTrue(samsungGalaxyS7.getPhoneName().isSelected());
		
	}
	
	@Test (priority =50)
	public void deletingItemFromTheCart() {
		cart.ClickDelete();
		assertFalse(cart.getDeleteButton().isDisplayed());
	}
	
	@Test(priority =60)
	public void chosenItemIsVisibleInCaart() {
		cart.getNameOftheItemPhone();
		assertTrue(cart.getNameOftheItemPhone().isDisplayed());
		assertFalse(cart.getDeleteButton().isDisplayed());
	}
	
	@Test (priority =70)
	public void chosenItemAddedAndDeleted() {
		cart.getNameOftheItemPhone().click();
		cart.getDeleteButton().click();
		assertFalse(cart.getNameOftheItemPhone().isDisplayed());
		assertFalse(cart.getDeleteButton().isDisplayed());
	}
	
//	@Test(priority =70)
//	public void addingMacBookAndS6
//	
//	
//	
//	
	
	
	@AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }
	



}
