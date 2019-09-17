package commonActions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GetProperties 
{
	public BufferedReader br=null;
	GetFolders folders=new GetFolders();
	public String getURL()
	{
		String url = null;
		try
		{
			br=new BufferedReader(new FileReader(folders.getPropertiesPath()));
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
	
	public String getbrowser()
	{
		String browser=null;
		try
		{
			br=new BufferedReader(new FileReader(folders.getPropertiesPath()));
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
