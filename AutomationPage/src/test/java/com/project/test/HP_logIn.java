package com.project.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.base.BaseClass;
import com.project.webpages.SignIn;


public class HP_logIn extends BaseClass
{

	private WebDriver driver;
	private SignIn lg;
	
	public HP_logIn()
	{
		super();
		
	}
	
	@BeforeMethod
	public void homepage()
	{
		driver=initWebdriver();
		lg=new SignIn(driver);	
	}

	@Test
	public void logIn()
	{
		
		PageFactory.initElements(driver, SignIn.class).login();
		assertEquals(lg.errorMsg(), " Invalid User Name or PassWord ");
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
