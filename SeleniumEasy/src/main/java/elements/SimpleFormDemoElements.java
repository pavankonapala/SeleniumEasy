package elements;

public class SimpleFormDemoElements 
{
		//Input Forms_Simple Form Demo
		private String inputForms_link_xpath="//a[text()='Input Forms']";
		private String simpleFormDemo_link_xpath="//a[text()='Input Forms']//following::ul[1]/li[1]";
		
		private String inputField_textBox_xpath="//input[@placeholder='Please enter your Message']";
		private String showMessage_button_xpath="//button[@onclick='showInput();']";
		private String outputMessage_display_xpath="//span[@id='display']";
		
		//Input Forms_Simple Form Demo_Two Input Fields
		
		private String var1_textBox_xpath="//input[@class='form-control'][@id='sum1']";
		private String var2_textBox_xpath="//input[@class='form-control'][@id='sum2']";
		private String getTotal_button_xpath="//button[@type='button' and @onclick='return total()']";
		private String displayVal_display_xpath="//span[@id='displayvalue']";
		
				
		public String getinputFormsLocator()
		{
			return inputForms_link_xpath;
		}
		
		public String getSimpleFormLocator()
		{
			return simpleFormDemo_link_xpath;
		}
		
		public String getInputFieldLocator()
		{
			return inputField_textBox_xpath;
		}
		
		public String getShowMessageLocator()
		{
			return showMessage_button_xpath;
		}
		
		public String getDisplayMessageLocator()
		{
			return outputMessage_display_xpath;
		}
		
		public String getVar1Locator()
		{
			return var1_textBox_xpath;
		}
		
		public String getVar2Locator()
		{
			return var2_textBox_xpath;
		}
		
		public String getTotalButtonLocator()
		{
			return getTotal_button_xpath;
		}
		
		public String getDisplayValueLocator()
		{
			return displayVal_display_xpath;
		}
}
