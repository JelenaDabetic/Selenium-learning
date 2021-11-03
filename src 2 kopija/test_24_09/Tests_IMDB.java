package test_24_09;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_24_09.Domaci_24_09_IMDB_base;

public class Tests_IMDB extends Domaci_24_09_IMDB_base {
	
	
	@BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.imdb.com/");
    }

	@Test (priority = 10)
	public void successfulLogInAndAddingMovie() throws InterruptedException {
		mainPageIMDB.SignInMain();
		preLogInIMDB.getSignInWithIMDb();
		Thread.sleep(2000);
		logInPageIMDB.insertEmail("dabe.test07@gmail.com");
		logInPageIMDB.insertPassword("Sifra123");
		logInPageIMDB.clickSubmitButton();
		Thread.sleep(2000);
		logEDInPageIMDB.ClickWatchListbutton();
		wishListPageIMDB.ClickOnEdit();
		wishListPageIMDB.AddNewMovie();
		Thread.sleep(2000);
		wishListPageIMDB.getChoosingFirstOnList();
		wishListPageIMDB.ComapringPreTestAndDuringTestTitles();
		
	}
	
	@Test (priority = 20)
	public void successfulLogInAddingAndDeleting() throws InterruptedException {
		mainPageIMDB.SignInMain();
		preLogInIMDB.getSignInWithIMDb();
		Thread.sleep(2000);
		logInPageIMDB.insertEmail("dabe.test07@gmail.com");
		logInPageIMDB.insertPassword("Sifra123");
		logInPageIMDB.clickSubmitButton();
		Thread.sleep(2000);
		logEDInPageIMDB.ClickWatchListbutton();
		wishListPageIMDB.ClickOnEdit();
		Thread.sleep(2000);
		wishListPageIMDB.AddNewMovie();
		wishListPageIMDB.getChoosingFirstOnList();
		Thread.sleep(2000);
		wishListPageIMDB.DeletingMovieFromList();
		wishListPageIMDB.ComapringDuringTestAndAfterTestTitles();
		
	}




	    @AfterMethod
	    public void deleteCookies() {
	        driver.manage().deleteAllCookies();
	    }
	    }
	    


