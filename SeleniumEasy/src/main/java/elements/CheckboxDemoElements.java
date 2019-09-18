package elements;

public class CheckboxDemoElements 

{
	private String xpath_link_CheckboxDemo="//a[text()='Input Forms']//following::ul[1]/li[2]";
	//private String linkText_CheckboxDemo="Checkbox Demo";
	private String xpath_Checkbox_SingleCheckbox="//input[contains(@id,'Age')]";
	private String xpath_outputMessage_Checkbox="//div[contains(text(),'Success')]";
	

	private String xpath_button_checkAll="//input[@value='Check All']";
	private String xpath_button_uncheckAll="//input[@value='Uncheck All']";
	private String xpath_checkBox_Option1="//label[text()='Option 1']";
	private String xpath_checkBox_Option2="//label[text()='Option 2']";
	private String xpath_checkBox_Option3="//label[text()='Option 3']";
	private String xpath_checkBox_Option4="//label[text()='Option 4']";
	
	public String getCheckBoxDemoLocator()
	{
		return xpath_link_CheckboxDemo;
	}
	
	public String getsingleCheckboxLocator()
	{
		return xpath_Checkbox_SingleCheckbox;
	}
	
	public String getcheckboxOutputMessageLocator()
	{
		return xpath_outputMessage_Checkbox;
	}
	
	public String getCheckAllButtonLocator()
	{
		return xpath_button_checkAll;
	}
	
	public String getUncheckAllButtonLocator()
	{
		return xpath_button_uncheckAll;
	}
	
	public String getOptn1CheckBoxLocator()
	{
		return xpath_checkBox_Option1;
	}
	
	public String getOptn2CheckBoxLocator()
	{
		return xpath_checkBox_Option2;
	}
	public String getOptn3CheckBoxLocator()
	{
		return xpath_checkBox_Option3;
	}
	public String getOptn4CheckBoxLocator()
	{
		return xpath_checkBox_Option4;
	}
}
