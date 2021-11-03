package testClass;

public class TestQA extends BaseClass {
	
@BeforeMethod
	
	public void pageSetUP() {
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		//driver.navigate().to(homeurl);
		WebDriverWait wdwait;
	}



@Test (priority=10)
	 public void ClickOnElementsCard() {
	
	
	
	homePage01.ClickOnElementsCard();
	elements02.GetTextElementsHeader();
	
//	assert.assertTrue(elements02.getElementsHeader().isDisplayed();
//	assertEquals("Elements", elements02.GetTextElementsHeader());
	
	//assert.assertEquals(elements02.getElementsHeader(), elements02.GetTextElementsHeader());
	
	
}


}


