package selenium_basics_pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	
	public static void main(String[] args) throws IOException
	{
		
		String projectPath = System.getProperty("user.dir");  // till project folder
		String path = "\\src\\Files\\Config.properties";        // after project folder path
		String filePath = projectPath + path;
		
		FileInputStream file = new FileInputStream(filePath);  // to let java know that we want to handle this file
		Properties prop = new Properties();     													// object of Properties class
		prop.load(file);																													// open/load the file
		String url = prop.getProperty("TestSiteUrl");    					// get the data using propertyName
		System.out.println(url);
		
		String userID = prop.getProperty("UserID");
		System.out.println(userID);
		
	}

}
