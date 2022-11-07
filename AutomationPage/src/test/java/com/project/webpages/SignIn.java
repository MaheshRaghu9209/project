package com.project.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.base.BaseClass;
import com.project.util.Common;

public class SignIn {

	private WebDriver driver;
	
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(css = "button#btn1")    					private WebElement butn1;
	@FindBy(xpath = "//input[@placeholder='E mail']")   private WebElement id;
	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement pswd;
	@FindBy(id = "enterbtn")							private WebElement enter;
	@FindBy(id = "logo")								private WebElement logo;
	@FindBy(id = "errormsg")							private WebElement msg;
	
	public  boolean logo1()
	{
		return logo.isDisplayed();
	}
	
	public void login()
	{
		if(this.logo1())
		{
			butn1.click();
			id.sendKeys(BaseClass.prop.getProperty("userName"));
			pswd.sendKeys(BaseClass.prop.getProperty("pass"));
			enter.click();
		}
		
		else
		{
			Common.logger.error("Log is not displayed");
		}
	}
	
	public String errorMsg()
	{
		return msg.getText();
	}
}
