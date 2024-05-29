package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	
	public static String readData(String propertyName) throws IOException
	{
		
		String projectPath = System.getProperty("user.dir");  // till project folder
		String path = "\\Config.properties";        // after project folder path
		String filePath = projectPath + path;
		
		FileInputStream file = new FileInputStream(filePath);  // to let java know that we want to handle this file
		Properties prop = new Properties();     													// object of Properties class
		prop.load(file);																													// open/load the file
		
		String data = prop.getProperty(propertyName);

		return data;
	}

}
