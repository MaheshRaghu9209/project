package com.project.webpages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.security.Key;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import com.project.util.Common;

public class RegisterPage {
	private WebDriver driver;
	HomePage obj;

	public RegisterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		

	}
	
	
	@FindBy(css = "input[placeholder='First Name']") private WebElement fname;
	@FindBy(css = "input[placeholder='Last Name']")  private WebElement lname;
	@FindBy(tagName = "textarea")					 private WebElement address;
	@FindBy(css = "input[type='email']")             private  WebElement email;
	@FindBy(css = "input[type='tel']")				 private  WebElement tel;
	@FindBy(css = "input[value='Male']")			 private  WebElement genderM;
	@FindBy(xpath = "//input[@id='checkbox1']/following-sibling ::label")  WebElement m;
	@FindBy(css = "input[value='FeMale']") 			 private  WebElement genderF;
	@FindBy(id = "checkbox1")						 private WebElement check1;
	@FindBy(id = "checkbox2")						 private  WebElement check2;
	@FindBy(id = "checkbox3")						 private  WebElement check3;
	@FindBy(id = "Skills")							 private  WebElement skil;
	@FindBy(css ="b[role='presentation']") 			 private  WebElement cntre;
	@FindBy(css = "input[type='search']")			 private  WebElement country;
	@FindBy(id = "yearbox") 						 private  WebElement yr;
	@FindBy(css ="select[placeholder='Month']")		 private  WebElement mnth;
	@FindBy(id = "daybox")							 private  WebElement day;
	@FindBy(id = "firstpassword")					 private  WebElement pswd;
	@FindBy(id="secondpassword")					 private  WebElement cpswd;
	@FindBy(css = "button#Button1")					 private  WebElement refrsh;
	@FindBy(css = "img#imagetrgt")					 private  WebElement logo1;
	
	public  boolean logo()
	{
		return logo1.isDisplayed();
	}
	

	
	public void reg(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l) throws IOException, InterruptedException
	{
		obj=new HomePage(driver);
		obj.clickOnArrow();
		
		if(this.logo())
		{
			fname.sendKeys(a);
			lname.sendKeys(b);
			address.sendKeys(c);
			email.sendKeys(d);
			tel.sendKeys(e);
			genderM.click();
			String text = m.getText();
			assertEquals(text, "Cricket");
			check1.click();
			check2.click();
			check3.click();
			Select s=new Select(skil);
			s.selectByVisibleText(f);
			
			cntre.click();
			
			country.sendKeys(g);
			country.sendKeys(Keys.ENTER);
			Select s1=new Select(yr);
			s1.selectByVisibleText(h);
			
			Select s2=new Select(mnth);
			s2.selectByVisibleText(i);
			
			Select s3=new Select(day);
			s3.selectByVisibleText(j);
			
			pswd.sendKeys(String.valueOf(k));
			cpswd.sendKeys(String.valueOf(l));
			refrsh.click();
		}
	else
		{
		Common.logger.error("Logo is not found");
		
		
		}
	}
}
