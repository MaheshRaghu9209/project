package com.project.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Datepick {

	private WebDriver driver;
	HomePage hompg;

	@FindBy(xpath = "/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")
	WebElement calender;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")
	WebElement arrow;

	@FindBy(css = "a[class='ui-state-default']")
	WebElement date;

	public Datepick(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public RegisterPage selectDate() {

		driver.navigate().to("https://demo.automationtesting.in/Datepicker.html");
		calender.click();
		arrow.click();

		List date = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]"));
		date.size();
		int count = date.size();
		System.out.println("Days in Dec month: " + count);

		for (int i = 0; i < count; i++) {

			String dayvalue = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(i).getText();
			
			
			if (dayvalue.equalsIgnoreCase("13")) {
				driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(i).click();
				System.out.println("Date Selected: " + i);
			}
		}

		return new RegisterPage(driver);

	}

}
