package commonActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BrowserActivities 
{
	WebDriver driver=null;
	GetFolders folders=new GetFolders();
	GetProperties properties=new GetProperties();
	
	@Test
	public WebDriver openURL()
	{
		System.setProperty("webdriver.chrome.driver",folders.getDriversPath()+"//chromedriver.exe");
		if(properties.getbrowser().equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(properties.getbrowser().equals("Internet Explorer"))
		{
			driver=new InternetExplorerDriver();
		}
		else if(properties.getbrowser().equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get(properties.getURL());
		driver.manage().window().maximize();
		return driver;
	}
	
	public void closeURL()
	{
		driver.close();
	}
}
