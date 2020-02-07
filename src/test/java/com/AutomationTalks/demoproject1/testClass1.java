package com.AutomationTalks.demoproject1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testClass1 {
	
	public  WebDriver driver;
	@BeforeMethod
	public void launcdriver()
	{
		System.setProperty("webdriver.gecko.driver", "/home/ranjeet/Downloads/geckodriver/");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public void test1()
	{   
		driver.get("https://nwapi.agritechie.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
