package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base 
{
	public WebDriver driver=null;
	GetProperties properties=new GetProperties();
	
	//Return driver based on user selection.
	public WebDriver getDriver()
	{
		String driverType=properties.getbrowser();
		
		if (driverType.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (driverType.equals("FireFox"))
		{
			driver=new FirefoxDriver();
		}
		else if(driverType.equals("Internet Explorer"))
		{
			driver=new InternetExplorerDriver();
		}
		else if (driverType.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		return driver;
	}
}
