package com.project.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WindowHandling 
{
	private WebDriver driver;
	public WindowHandling(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id = "footer")   WebElement ftr;
	@FindBy(tagName = "a")	 WebElement links;
	
	public void windowHandle(){
		List<WebElement> al = ftr.findElements((By) links);
		int size = al.size();
		
		for(int i=0;i<size;i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			ftr.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> al1=new ArrayList(windowHandles);
		Iterator<String> itr = al1.iterator();
		
		while (itr.hasNext()) {
			
			driver.switchTo().window(itr.next());
			driver.getTitle();
		}
	}
	
	public void m1()
	{
		System.out.println("Hello");
	}

}
