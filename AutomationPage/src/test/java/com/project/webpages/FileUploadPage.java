package com.project.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
	private WebDriver driver;
	
	@FindBy(css="input#input-4")
	WebElement browse;
		
	public FileUploadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnBrowse()
	{
		browse.click();
	}

}
