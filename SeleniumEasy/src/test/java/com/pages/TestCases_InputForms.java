package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonActions.BrowserActivities;
import commonActions.ElementActions;
import elements.CheckboxDemoElements;
import elements.SimpleFormDemoElements;

public class TestCases_InputForms 
{
	BrowserActivities browserActivities=new BrowserActivities();
	ElementActions elementActions=new ElementActions();
	SimpleFormDemoElements simpleFormDemoelements=new SimpleFormDemoElements();
	CheckboxDemoElements checkboxElements=new CheckboxDemoElements();
	WebDriver driver=null;
	
	@BeforeTest
	public void init()
	{
		driver=browserActivities.openURL();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void close()
	{
		browserActivities.closeURL();
	}
	
	@Test
	public void singleInputField()
	{
		String inputText="Loser Pavan";
		elementActions.clickLinkByXPATH(driver, simpleFormDemoelements.getinputFormsLocator());
		elementActions.clickLinkByXPATH(driver, simpleFormDemoelements.getSimpleFormLocator());
		elementActions.sendTextByXPATH(driver, simpleFormDemoelements.getInputFieldLocator(), inputText);
		elementActions.clickButtonByXPATH(driver, simpleFormDemoelements.getShowMessageLocator());
		
		String output=elementActions.getDisplayMessageByXPATH(driver, simpleFormDemoelements.getDisplayMessageLocator());
		
		if(inputText.equals(output))
		{
			System.out.println("Test case is Passed.");
		}
		else
		{
			System.out.println("Test case is Failed.");
		}
	}
	
	@Test
	public void twoInputFields()
	{
		int var1=10;
		int var2=20;
		
		elementActions.clickLinkByXPATH(driver, simpleFormDemoelements.getinputFormsLocator());
		elementActions.clickLinkByXPATH(driver, simpleFormDemoelements.getSimpleFormLocator());
		elementActions.sendTextByXPATH(driver,simpleFormDemoelements.getVar1Locator() , Integer.toString(var1));
		elementActions.sendTextByXPATH(driver,simpleFormDemoelements.getVar2Locator() , Integer.toString(var2));
		elementActions.clickButtonByXPATH(driver, simpleFormDemoelements.getTotalButtonLocator());
		
		String output=elementActions.getDisplayMessageByXPATH(driver,simpleFormDemoelements.getDisplayValueLocator());
		
		if(var1+var2==Integer.parseInt(output))
		{
			System.out.println("Test case is Passed.");
		}
		else
		{
			System.out.println("Test case is Failed.");
		}
		
	}
	
	@Test
	public void singleCheckBox_withXPATH()
	{
		elementActions.clickLinkByXPATH(driver, simpleFormDemoelements.getinputFormsLocator());
		elementActions.clickLinkByXPATH(driver, checkboxElements.getCheckBoxDemoLocator());
		elementActions.clickLinkByXPATH(driver,checkboxElements.getsingleCheckboxLocator());
		String output=elementActions.getDisplayMessageByXPATH(driver, checkboxElements.getcheckboxOutputMessageLocator());
		
		if(output.equals(""))
		{
			System.out.println("Test Case is Failed.");
		}
		else
		{
			System.out.println("Test Case is Passed.");
			System.out.println(output);
		}
	}
}
