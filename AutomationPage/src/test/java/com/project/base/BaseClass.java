package com.project.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.project.util.Common;

public class BaseClass {
	 public static Properties prop;
		FileInputStream ip;
		 WebDriver driver;
		public BaseClass()
		{
			prop=new Properties();
			try {
				ip=new FileInputStream("C:\\Users\\Administrator\\git\\project\\AutomationPage\\src\\test\\resources\\configuration\\config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
					
		public WebDriver initWebdriver()
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\git\\project\\AutomationPage\\src\\test\\resources\\chromedriver.exe");
				 driver=new ChromeDriver();
				 driver.manage().deleteAllCookies();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Common.PAGETIMEOUT));
				 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Common.IMPLICITETIMEOUT));
				 driver.get(prop.getProperty("url"));
				
				
				 
			}
			 return driver;
		}
		public static void main(String[] args) {
			
		}

}
