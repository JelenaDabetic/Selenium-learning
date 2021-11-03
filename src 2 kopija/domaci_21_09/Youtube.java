package domaci_21_09;


	
	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	// otici na sajt youtube
	// u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
	// voditi racuna da ako postoje reklame da ih preskocite
	// Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video

public class Youtube{
	public static void main (String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "driver-lib//chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://youtube.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			
			WebDriverWait wdwait = new WebDriverWait(driver, 20);
			wdwait.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
			WebElement search = driver.findElement(By.name("search_query"));
			search.clear();
			Thread.sleep(2000);
			search.click();
			Thread.sleep(2000);
			search.sendKeys("what if I told you");
			Thread.sleep(2000);
			search.click();
			search.sendKeys(Keys.ENTER);
			
			
			WebDriverWait wdwait2 = new WebDriverWait(driver, 20);
			wdwait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")));
			
			WebElement video = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", video);
			video.click();
			Thread.sleep(2000);
			
			WebElement video2 = driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-compact-video-renderer[2]"));
			video2.click();
		

			driver.close();
			
			
		}
	}

	



