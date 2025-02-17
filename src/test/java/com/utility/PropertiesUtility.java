package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	public static String getTestData(String key) throws IOException
	{
		
		//Creating file class object and passed the file path
		File file = new File("C:\\Users\\ranja\\Desktop\\Study\\TestData.properties");
		
		//create file reader class object
		FileReader fileReader = new FileReader(file);
		//create property class object
		Properties prop = new Properties();
		
		//load properties file
		prop.load(fileReader);
		
		//call get() method of properties class
		return prop.get(key).toString();
	}
}
