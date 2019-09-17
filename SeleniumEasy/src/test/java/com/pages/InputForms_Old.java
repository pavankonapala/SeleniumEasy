package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Base.GetProperties;

import elementsAndactions.ElementLocators;

public class InputForms_Old 
{
	WebDriver driver=null;
	Base base=new Base();
	GetProperties properties=new GetProperties();
	ElementLocators locators=new ElementLocators();
	
	@BeforeTest
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", properties.getActiveFolder()+"//Drivers//chromedriver.exe");
		driver=base.getDriver();
		driver.get(properties.getURL());
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test
	public void singleInputField_withXPATH()
	{
		
		String msg ="Loser Pavan";
		driver.findElement(By.xpath(locators.xpath_InputForms)).click();
		driver.findElement(By.xpath(locators.xpath_SimpleFormDemo)).click();
		/*driver.findElement(By.linkText(locators.linkText_inputForms)).click();
		driver.findElement(By.linkText(locators.linkText_simpleFormDemo)).click();*/
		driver.findElement(By.xpath(locators.xpath_textBox_inputField)).sendKeys(msg);
		driver.findElement(By.xpath(locators.xpath_button_showMessage)).click();
		if(msg.equals(driver.findElement(By.xpath(locators.xpath_outputMessage)).getText()))
		{
			System.out.println("Test case is passed.");
		}
		else
		{
			System.out.println("Test case is Failed.");
		}
	}
	
	@Test
	public void twoInputFields_withXPATH()
	{
		int var1=10;
		int var2=20;
		
		driver.findElement(By.xpath(locators.xpath_InputForms)).click();
		driver.findElement(By.xpath(locators.xpath_SimpleFormDemo)).click();
		/*driver.findElement(By.linkText(locators.linkText_inputForms)).click();
		driver.findElement(By.linkText(locators.linkText_simpleFormDemo)).click();*/
		driver.findElement(By.xpath(locators.xpath_textBox_variable1)).sendKeys(Integer.toString(var1));
		driver.findElement(By.xpath(locators.xpath_textBox_variable2)).sendKeys(Integer.toString(var2));
		driver.findElement(By.xpath(locators.xpath_button_getTotal)).click();
		if(Integer.toString(var1+var2).equals(driver.findElement(By.xpath(locators.xpath_displayValue)).getText()))
		{
			System.out.println("Test case is passed.");
		}
		else
		{
			System.out.println("Test case is failed.");
		}
	
	}
	
	@Test
	public void singleCheckBox_withXPATH()
	{
		driver.findElement(By.xpath(locators.xpath_InputForms)).click();
		driver.findElement(By.xpath(locators.xpath_link_CheckboxDemo)).click();
		/*driver.findElement(By.linkText(locators.linkText_inputForms)).click();;
		driver.findElement(By.linkText(locators.linkText_CheckboxDemo)).click();*/
		driver.findElement(By.xpath(locators.xpath_Checkbox_SingleCheckbox)).click();
		String output=driver.findElement(By.xpath(locators.xpath_outputMessage_Checkbox)).getText();
		
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
	
	@Test
	public void multipleCheckbox_withXPATH()
	{

		driver.findElement(By.xpath(locators.xpath_InputForms)).click();
		driver.findElement(By.xpath(locators.xpath_link_CheckboxDemo)).click();
		/*driver.findElement(By.linkText(locators.linkText_inputForms)).click();
		driver.findElement(By.linkText(locators.linkText_CheckboxDemo)).click();*/
		//assertTrue(driver.findElement(By.xpath(locators.xpath_button_checkAll)).getText().equals("Check All"));
		String buttonText=driver.findElement(By.xpath(locators.xpath_button_checkAll)).getText();
		if (buttonText.equals("Check All"))
		{
			System.out.println("Button text is:"+buttonText);
		}
				
		driver.findElement(By.xpath(locators.xpath_button_checkAll)).click();
		buttonText=driver.findElement(By.xpath(locators.xpath_button_uncheckAll)).getText();
		if (buttonText.equals("Uncheck All"))
		{
			System.out.println("Button text is:"+buttonText);
		}
		//assertTrue(driver.findElement(By.xpath(locators.xpath_button_uncheckAll)).getText().equals("Uncheck All"));
		driver.findElement(By.xpath(locators.xpath_checkBox_Option2)).click();
		//assertTrue(driver.findElement(By.xpath(locators.xpath_button_checkAll)).getText().equals("Check All"));
		
	}
	
	@Test
	public void radioButtonDemo()
	{
		/*Scanner sc=new Scanner("System.in");
		String input=sc.nextLine();
		sc.close();*/
		String input="Female";
		driver.findElement(By.xpath(locators.xpath_InputForms)).click();
		driver.findElement(By.xpath(locators.xpath_link_radioButtonDemo)).click();
		if(input.equals("Male"))
		{
			driver.findElement(By.xpath(locators.xpath_radioButton_male)).click();
		}
		else if (input.equals("Female"))
		{
			driver.findElement(By.xpath(locators.xpath_radioButton_female)).click();
		}
		
		String output=driver.findElement(By.xpath(locators.xpath_message_singleRadioButton)).getText();
		if(output.equals("Radio button '"+input+"' is checked"))
		{
			System.out.println("Test case is passed.");
		}
		else
		{
			System.out.println("Test case is failed.");
		}
				
	}
	
	@Test
	public void groupRadioButton()
	{
		String input1="Female";
		String input2="15 to 50";
		
		driver.findElement(By.xpath(locators.xpath_InputForms)).click();
		driver.findElement(By.xpath(locators.xpath_link_radioButtonDemo)).click();
		if(input1.equals("Male"))
		{
			driver.findElement(By.xpath(locators.xpath_radiobutton_group_male)).click();
		}
		else if (input1.equals("Female"))
		{
			driver.findElement(By.xpath(locators.xpath_radiobutton_group_female)).click();
		}
		
		if(input2.equals("0 to 5"))
		{
			driver.findElement(By.xpath(locators.xpath_radiobutton_age1)).click();
		}
		else if (input2.equals("5 to 15"))
		{
			driver.findElement(By.xpath(locators.xpath_radiobutton_age2)).click();
		}
		else if (input2.equals("15 to 50"))
		{
			driver.findElement(By.xpath(locators.xpath_radiobutton_age3)).click();
		}
		
		driver.findElement(By.xpath(locators.xpath_button_getValues)).click();
		String output=driver.findElement(By.xpath(locators.xpath_message_groupRadiobutton)).getText();
		System.out.println(output);
	}
	
	@Test
	public void singleSelect()
	{
		String input="Monday";
				
		//Select select=new Select(driver.findElement(By.id(locators.id_select_single)));
		driver.findElement(By.xpath(locators.xpath_InputForms)).click();
		driver.findElement(By.xpath(locators.xpath_link_selectDropdown)).click();
		Select select=new Select(driver.findElement(By.xpath(locators.xpath_select_single)));
		select.selectByVisibleText(input);
		System.out.println(driver.findElement(By.xpath(locators.xpath_message_selected)).getText());
		System.out.println(select.getFirstSelectedOption().getText());
		
		List<WebElement> list=select.getOptions();
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	@Test
	public void multiSelect()
	{
		driver.findElement(By.xpath(locators.xpath_InputForms)).click();
		driver.findElement(By.xpath(locators.xpath_link_selectDropdown)).click();
		
	}
}
