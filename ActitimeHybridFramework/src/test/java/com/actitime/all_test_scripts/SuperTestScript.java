package com.actitime.all_test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class SuperTestScript 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void preConfig()
	{
		String browserType="FF";
		if(browserType.equalsIgnoreCase("FF"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("GC"))
		{
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		else
		{
			driver = new EdgeDriver();
		}
		driver.get("http://sunnyscomputer/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postConfig()
	{
		driver.close();
	}
	
}
