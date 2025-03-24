package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Constants.Constants_New;

public class FetchDataFromPropertyFile {
	
	public static Properties readDataFromProperty() throws IOException
	{
		FileReader reader = new FileReader(Constants_New.PROPERTY_FILE_PATH);
		Properties prop = new Properties();
		prop.load(reader);
		return prop;
	}
	
	
}
