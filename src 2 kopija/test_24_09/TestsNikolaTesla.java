package test_24_09;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_24_09.BaseClass;
import base_24_09.BaseClassNikolaT;
	
	public class TestsNikolaTesla extends BaseClassNikolaT {

	    @BeforeMethod
	    public void pageSetUp() {
	        driver.manage().window().maximize();
	        driver.navigate().to("https://www.wikipedia.org/");
	    }

	    @Test (priority = 10)
	    public void checkingResultsOfSearch() {
	       wikipediaNikolaT.UnosTekstaNikolaTesla();
	       wikipediaNikolaT.ProveraNaslovaNaDobijenojStranici();

	    }



//	        @Test (priority = 10)
//	        public void successfulLogIn() {
//	            logInPage.insertUsername("student");
//	            logInPage.insertPassword("Password123");
//	            logInPage.clickSubmitButton();
//	            Assert.assertTrue(logOutPage.getLogOutButton().isDisplayed());
//	        }

}