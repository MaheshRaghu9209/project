package com.project.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.base.BaseClass;
import com.project.webpages.Datepick;

public class DatePickTest extends BaseClass {

	private WebDriver driver;
	private Datepick dp;

	public DatePickTest() {
		super();
	}

	@BeforeMethod
	public void initHomePage() {

		driver = initWebdriver();
		dp = new Datepick(driver);
	}
	
	@Test
	public void datesel() {
		dp.selectDate();
		
	}
	
	@AfterMethod
	public void tearDownHomePage()
	{
		//driver.quit();
	}
}
