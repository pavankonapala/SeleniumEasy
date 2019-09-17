package com.Base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class GetProperties 
{
		public BufferedReader br=null;
		
		//To get current project directory
		public String getActiveFolder()
		{
			return System.getProperty("user.dir");
		}
		
		//To get URL from the properties file
		
		public String getURL()
		{
			String url=null;
			try
			{
				br=new BufferedReader(new FileReader(getActiveFolder()+"//Input//properties.txt"));
				String line;
				while ((line=br.readLine())!=null)
				{
					if(line.substring(0,3).equalsIgnoreCase("URL"))
					{
						url= line.substring(line.indexOf(":")+1).trim();
					}
					
				}
			}catch(IOException e){
				e.printStackTrace();
			}finally
			{
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		
		return url;
		
		}
		
		//Get Browser type
		public String getbrowser()
		{
			String browser=null;
			try
			{
				br=new BufferedReader(new FileReader(getActiveFolder()+"//Input//properties.txt"));
				String line;
				while ((line=br.readLine())!=null)
				{
					if(line.substring(0,7).equalsIgnoreCase("Browser"))
					{
						browser= line.substring(line.indexOf(":")+1).trim();
					}
					
				}
			}catch(IOException e){
				e.printStackTrace();
			}finally
			{
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		
		return browser;
		
		}

}
