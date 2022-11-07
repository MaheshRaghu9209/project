package com.project.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.project.base.BaseClass;
import com.project.webpages.HomePage;

public class HomePageTest extends BaseClass{
	
	private WebDriver driver;
	private HomePage homePageObj;
	
//	public HomePageTest()
//	{
//		super();
//	}
	
	@BeforeMethod
	public void initHomePage()
	{
		
		driver=initWebdriver();
		homePageObj=new HomePage(driver);
	}
	
	@Test
	public void logoDisplayed()
	{
//		SoftAssert softAssert=new SoftAssert(); 
//		softAssert.assertEquals(homePageObj.logDisplayed(), true); 
		PageFactory.initElements(driver, HomePage.class).logDisplayed();

		PageFactory.initElements(driver, HomePage.class).clickOnArrow();
	}
	
	
	@AfterMethod
	public void tearDownHomePage()
	{
		driver.quit();
	}

	
}
