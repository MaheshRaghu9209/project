package com.project.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.base.BaseClass;
import com.project.base.Data;
import com.project.util.Common;
import com.project.webpages.HomePage;
import com.project.webpages.RegisterPage;

public class RegisterPageTest extends BaseClass {
	
	private WebDriver driver;
	private HomePage homePageObj;
	
	
	@BeforeMethod
	public void initHomePage()
	{
		
		driver=initWebdriver();
		homePageObj=new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Common.IMPLICITETIMEOUT));
		
	}
	
	@Test(dataProvider = "getData")
	public void Registration(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l) throws IOException, InterruptedException
	{
//		homePageObj.clickOnArrow().reg(a, b, c, d, e, f, g, h, i, j, k, l);
		
		PageFactory.initElements(driver, RegisterPage.class).reg(a, b, c, d, e, f, g, h, i, j, k, l);
	}
	@DataProvider
	public String[][] getData() throws IOException 
	{
		return Data.readingXls();

	}
	@AfterMethod
	public void tearDownHomePage()
	{
		driver.quit();
	}

	

}
