/*package com.Base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test 
{
	public static void main(String [] args)
	{
		String browser=null;
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new FileReader(System.getProperty("user.dir")+"//Input//properties.txt"));
			String line;
			while ((line=br.readLine())!=null)
			{
				System.out.println(line);
				System.out.println(line.substring(0,7));
				if(line.substring(0,7).equalsIgnoreCase("Browser"))
				{
					browser= line.substring(line.indexOf(":")+1);
					System.out.println(browser.trim());
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
	
	}
}
*/