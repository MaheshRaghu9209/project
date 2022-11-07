package com.project.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.base.BaseClass;

public class HomePage {
	private  WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"logo\"]")
	WebElement logo;
	@FindBy(id = "email")  WebElement email;
	@FindBy(xpath="//*[@id=\"enterimg\"]")
	 WebElement arrow;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public boolean logDisplayed()
	{
		return logo.isDisplayed();
	}
	
	public RegisterPage clickOnArrow()
	{
		email.sendKeys(BaseClass.prop.getProperty("userName"));
		arrow.click();
		return new RegisterPage(driver);
	}
	
	
}
