package TestNG01_23_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TreciZadatak {
	
	WebDriver driver;
	
	@BeforeClass
    public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
		 driver=new ChromeDriver();
    }

    @BeforeMethod
    public void driverSetUp() {
        driver.manage().window().maximize();
    }
    
    @AfterClass
    public void zatvaranjeStranice() {
    	driver.close();
    }
    
    @Test (priority = 10)
    public void testPositiveLogin() throws InterruptedException {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("student");
        
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        username.sendKeys("Password123");
        
        Thread.sleep(2000);
       
        WebElement submit= driver.findElement(By.id("submit"));
        submit.click();
        
        
        
//        WebElement tekstNaUlogovanojStr= driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/p[1]/strong"));
//        String dobijeniTekst= tekstNaUlogovanojStr.getText();
//        String ocekivaniTekst="Congratulations' or 'successfully logged in";
//        Assert.assertEquals(ocekivaniTekst, dobijeniTekst);
//        //tekstNaUlogovanojStr.isDisplayed();
        
        WebElement dugmeLogOut = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div/div/div/a"));
       Assert.assertTrue(dugmeLogOut.isDisplayed());
    }
    
    @Test (priority=20)
    public void testWrongUsernameLogin() throws InterruptedException {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("incorrectUser");
        
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        username.sendKeys("Password123");
       
        WebElement submit= driver.findElement(By.id("submit"));
        submit.click();
       
        
        WebElement tekstNaUlogovanojStr1= driver.findElement(By.id("error"));
        String dobijeniTekst1= tekstNaUlogovanojStr1.getText();
        String ocekivaniTekst1="Your username is invalid!";
        Assert.assertEquals(ocekivaniTekst1, dobijeniTekst1);
        

    }
    
    @Test (priority=30)
    public void testWrongPasswordLogin() throws InterruptedException {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("student");
        
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        username.sendKeys("incorrectPassword");
       
        WebElement submit= driver.findElement(By.id("submit"));
        submit.click();
       
        
        WebElement tekstNaUlogovanojStrpasswordm= driver.findElement(By.xpath("/html/body/div/div/section/section/div[2]"));
        String dobijeniTekstpasswordm= tekstNaUlogovanojStrpasswordm.getText();
        String ocekivaniTekstpasswordm="Your password is invalid!";
        Assert.assertEquals(ocekivaniTekstpasswordm, dobijeniTekstpasswordm);
        

    }
    
}


