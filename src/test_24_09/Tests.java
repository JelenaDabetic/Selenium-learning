package test_24_09;

import base_24_09.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Tests extends BaseClass {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    @Test (priority = 10)
    public void successfulLogIn() {
        logInPage.insertUsername("student");
        logInPage.insertPassword("Password123");
        logInPage.clickSubmitButton();
        Assert.assertTrue(logOutPage.getLogOutButton().isDisplayed());
    }
	    

	    
	    @Test (priority = 20)
	    public void incorrectUsername() {
	        logInPage.insertUsername("abc");
	        logInPage.insertPassword("Password123");
	        logInPage.clickSubmitButton();

	    }
	    
	    @Test (priority = 30)
	    public void incorrectPassword() {
	        logInPage.insertUsername("student");
	        logInPage.insertPassword("123");
	        logInPage.clickSubmitButton();
	    }

	    @AfterMethod
	    public void deleteCookies() {
	        driver.manage().deleteAllCookies();
	    }
	    }
	    
	  


	

	    