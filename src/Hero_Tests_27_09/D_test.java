package Hero_Tests_27_09;


import Hero_BaseTest_27_09.XcelReader;
import Hero_Pages_27_09.D_logIn;
import Hero_Pages_27_09.D_logOut;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class D_test {
	
	


	    public static WebDriver driver;
	    public static D_logIn d_logIn;
	    public static D_logOut d_logOut;
	    public XcelReader xcelReader;
	    public String homeUrl;
	    public static WebDriverWait wdwait;

	    @BeforeClass
	    public void setUp() throws IOException {
	        //WebDriverManager.chromedriver().setup();
	        System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	        driver = new ChromeDriver();
	        d_logIn = new D_logIn(driver, wdwait);
	        d_logOut = new D_logOut(driver);
	        xcelReader = new XcelReader("C:\\Users\\drago\\OneDrive\\Desktop\\TestData.xlsx");
	        homeUrl = xcelReader.getStringData("LoginTest",1, 0);
	        wdwait = new WebDriverWait(driver, 20);
	    }
	    
	    
	    @Test (priority = 10)
	    public void successfulLogIn() {
	        String username = xcelReader.getStringData("LoginTest", 1, 1);
	        String password = xcelReader.getStringData("LoginTest", 1, 2);
	        String button = xcelReader.getStringData("LoginTest", 1, 5);
	        String text = xcelReader.getStringData("LoginTest", 1, 7);

	        d_logIn.insertUsername(username);
	        d_logIn.insertPassword(password);
	        d_logIn.clickSubmitButton();

	        Assert.assertTrue(d_logIn.DlogIn().isDisplayed());
	        Assert.assertEquals(d_logOut.logOutButtonText(), button);
	        Assert.assertEquals(d_logIn.successfulLogInText(), text);

	    }
	    @Test (priority = 20)
	    public void incorrectUsername() throws InterruptedException {
	        for (int i = 1 ; i < xcelReader.getLastRowNumber(); i++) {

	            String username = xcelReader.getStringData("LoginTest", i, 3);
	            String password = xcelReader.getStringData("LoginTest", 1, 2);
	            String textUsername = xcelReader.getStringData("LoginTest", 3, 6);

	            logInPage.insertUsername(username);
	            logInPage.insertPassword(password);
	            logInPage.clickSubmitButton();
	            //logInPage.waiter(logInPage.getErrorText());
	            wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("error")));
	            Assert.assertEquals(logInPage.errorText(), textUsername);
	            try {
	                Assert.assertFalse(logOutPage.getLogOutButton().isDisplayed());
	            } catch (Exception NoSuchElement) {

	            }

	        }

	    }
	    @Test (priority = 30)
	    public void incorrectPassword() {
	        logInPage.insertUsername("student");
	        logInPage.insertPassword("123");
	        logInPage.clickSubmitButton();
	        
	        
	    }


	    @AfterClass
	    public void tearDown() {
	        //driver.close();
	        //driver.quit();
	    }


	}
	

	



