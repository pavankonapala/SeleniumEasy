 package elementsAndactions;

public class ElementLocators 
{
	//Input Forms_Simple Form Demo
	public String xpath_InputForms="//a[text()='Input Forms']";
	public String xpath_SimpleFormDemo="//a[text()='Input Forms']//following::ul[1]/li[1]";
	public String xpath_textBox_inputField="//input[@placeholder='Please enter your Message']";
	public String xpath_button_showMessage="//button[@onclick='showInput();']";
	public String xpath_outputMessage="//span[@id='display']";
	
	public String linkText_inputForms="Input Forms";
	public String linkText_simpleFormDemo="Simple Form Demo";
	
	//Input Forms_Simple Form Demo_Two Input Fields
	
	public String xpath_textBox_variable1="//input[@class='form-control'][@id='sum1']";
	public String xpath_textBox_variable2="//input[@class='form-control'][@id='sum2']";
	public String xpath_button_getTotal="//button[@type='button' and @onclick='return total()']";
	public String xpath_displayValue="//span[@id='displayvalue']";
	
	//Input Forms_Check Box_Single Check box
	public String xpath_link_CheckboxDemo="//a[text()='Input Forms']//following::ul[1]/li[2]";
	public String linkText_CheckboxDemo="Checkbox Demo";
	public String xpath_Checkbox_SingleCheckbox="//input[contains(@id,'Age')]";
	public String xpath_outputMessage_Checkbox="//div[contains(text(),'Success')]";
	
	//Input Fomrs_Check Box_Multiple Check box
	public String xpath_button_checkAll="//input[@value='Check All']";
	public String xpath_button_uncheckAll="//input[@value='Uncheck All']";
	public String xpath_checkBox_Option1="//label[text()='Option 1']";
	public String xpath_checkBox_Option2="//label[text()='Option 2']";
	public String xpath_checkBox_Option3="//label[text()='Option 3']";
	public String xpath_checkBox_Option4="//label[text()='Option 4']";
	
	//Radio Button Demo
	
	public String xpath_link_radioButtonDemo="//a[text()='Input Forms']//following::ul[1]/li[3]";
	public String xpath_radioButton_male="//input[@name='optradio' and @value='Male']";
	public String xpath_radioButton_female="//input[@name='optradio' and @value='Female']";
	public String xpath_button_getCheckedValue="//button[@id='buttoncheck']";
	public String xpath_message_singleRadioButton="//button[@id='buttoncheck']//following::p[1]";
	
	public String xpath_radiobutton_group_male="//input[@name='gender' and @value='Male']";
	public String xpath_radiobutton_group_female="//input[@name='gender' and @value='Female']";
	public String xpath_radiobutton_age1="//input[@name='ageGroup' and @value='0 - 5']";
	public String xpath_radiobutton_age2="//input[@name='ageGroup' and @value='5 - 15']";
	public String xpath_radiobutton_age3="//input[@name='ageGroup' and @value='15 - 50']";
	public String xpath_button_getValues="//button[text()='Get values']";
	public String xpath_message_groupRadiobutton="//button[text()='Get values']//following::p"; 
	
	
	//Select List
	public String xpath_link_selectDropdown="//a[text()='Input Forms']//following::ul[1]/li[4]";
	public String xpath_select_single="//select[@id='select-demo']";
	public String id_select_single="select-demo";
	public String xpath_message_selected="//p[@class='selected-value']";
	
	//public String xpath_
}
