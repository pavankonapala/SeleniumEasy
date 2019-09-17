package commonActions;

public class GetFolders 
{
	private String projectPath=System.getProperty("user.dir");
	private String propertiesFilePath=projectPath+"//Input//properties.txt";
	private String driversPath=projectPath+"//Drivers//";
	
	public String getProjectPath()
	{
		return projectPath;	
	}
	
	public String getPropertiesPath()
	{
		return propertiesFilePath;
	}
	
	public String getDriversPath()
	{
		return driversPath;
	}
}
