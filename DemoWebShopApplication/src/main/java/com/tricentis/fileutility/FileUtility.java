package com.tricentis.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	/**
	 * This method reads data from property file
	 * 
	 * @param key pass the key as mentioned in property file
	 * @return value of the key
	 * @throws IOException
	 */
	public String getDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
