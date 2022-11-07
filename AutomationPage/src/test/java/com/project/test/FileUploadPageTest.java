package com.project.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.project.base.BaseClass;
import com.project.webpages.HomePage;
import com.project.webpages.RegisterPage;

public class FileUploadPageTest extends BaseClass {
	WebDriver driver;
	HomePage objHomePage;
	RegisterPage objRegisterPage;
	public FileUploadPageTest() {
		super();
		
	}
	
	@BeforeMethod
	void initFileUpload()
	{
		driver=initWebdriver();
		objRegisterPage=objHomePage.clickOnArrow();
		
	}
	

}
