package elements;

public class RadiobuttonDemoElements 
{
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
}
