package commonActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementActions 
{
	WebDriver driver=null;
	public void clickLinkByXPATH(WebDriver driver1,String xpath)
	{
		driver=driver1;
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void clickLinkByid(WebDriver driver1,String id)
	{
		driver=driver1;
		driver.findElement(By.id(id)).click();
	}
	
	public void clickLinkByname(WebDriver driver1,String name)
	{
		driver=driver1;
		driver.findElement(By.name(name)).click();
	}
	public void clickLinkByLinkText(WebDriver driver1,String linkText)
	{
		driver=driver1;
		driver.findElement(By.linkText(linkText)).click();
	}
	
	public void clickLinkByPartialLinkText(WebDriver driver1,String partialLinkText)
	{
		driver=driver1;
		driver.findElement(By.partialLinkText(partialLinkText)).click();
	}
	
	public void sendTextByXPATH(WebDriver driver1,String xpath,String text)
	{
		driver=driver1;
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	
	public void sendTextByid(WebDriver driver1,String id,String text)
	{
		driver=driver1;
		driver.findElement(By.id(id)).sendKeys(text);;
	}
	
	public void sendTextByname(WebDriver driver1,String name,String text)
	{
		driver=driver1;
		driver.findElement(By.name(name)).sendKeys(text);
	}
	
	public void selectCheckBoxByXPATH(WebDriver driver1,String xpath)
	{
		driver=driver1;
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void selectCheckBoxByid(WebDriver driver1,String id)
	{
		driver=driver1;
		driver.findElement(By.id(id)).click();
	}
	
	public void selectCheckBoxByname(WebDriver driver1,String name)
	{
		driver=driver1;
		driver.findElement(By.name(name)).click();
	}
	
	public void selectRadioButtonByXPATH(WebDriver driver1,String xpath)
	{
		driver=driver1;
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void selectRadioButtonByid(WebDriver driver1,String id)
	{
		driver=driver1;
		driver.findElement(By.id(id)).click();
	}
	
	public void selectRadioButtonByname(WebDriver driver1,String name)
	{
		driver=driver1;
		driver.findElement(By.name(name)).click();
	}
	
	public void selectDropDownByIndexByXPATH(WebDriver driver1,String xpath,int index)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.xpath(xpath)));
		select.selectByIndex(index);
	}
	
	public void selectDropDownByValueByXPATH(WebDriver driver1,String xpath,String value)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.xpath(xpath)));
		select.selectByValue(value);
	}
	
	public void selectDropDownByVisibleTextByXPATH(WebDriver driver1,String xpath,String text)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.xpath(xpath)));
		select.selectByVisibleText(text);
	}
	
	public void selectDropDownByIndexByid(WebDriver driver1,String id,int index)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.id(id)));
		select.selectByIndex(index);
	}
	
	public void selectDropDownByValueByid(WebDriver driver1,String id,String value)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.id(id)));
		select.selectByValue(value);
	}
	
	public void selectDropDownByVisibleTextByid(WebDriver driver1,String id,String text)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.id(id)));
		select.selectByVisibleText(text);
	}
	
	public void selectDropDownByIndexByName(WebDriver driver1,String name,int index)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.name(name)));
		select.selectByIndex(index);
	}
	
	public void selectDropDownByValueByName(WebDriver driver1,String name,String value)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.name(name)));
		select.selectByValue(value);
	}
	
	public void selectDropDownByVisibleTextByName(WebDriver driver1,String name,String text)
	{
		driver=driver1;
		Select select=new Select(driver.findElement(By.name(name)));
		select.selectByVisibleText(text);
	}
	
	public String getDisplayMessageByXPATH(WebDriver driver1, String xpath)
	{
		driver=driver1;
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public String getDisplayMessageByid(WebDriver driver1, String id)
	{
		driver=driver1;
		return driver.findElement(By.xpath(id)).getText();
	}
	
	public String getDisplayMessageByName(WebDriver driver1, String name)
	{
		driver=driver1;
		return driver.findElement(By.xpath(name)).getText();
	}
	
	public void clickButtonByid(WebDriver driver1,String id)
	{
		driver=driver1;
		driver.findElement(By.id(id)).click();
	}
	
	public void clickButtonByName(WebDriver driver1,String name)
	{
		driver=driver1;
		driver.findElement(By.name(name)).click();
	}
	
	public void clickButtonByXPATH(WebDriver driver1,String xpath)
	{
		driver=driver1;
		driver.findElement(By.xpath(xpath)).click();
	}
}
