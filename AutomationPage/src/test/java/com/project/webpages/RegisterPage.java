package com.project.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	private WebDriver driver;

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	
}
