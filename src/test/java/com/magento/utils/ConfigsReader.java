package com.magento.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
   static Properties prop;
	
	public static void readProperties(String filepath) {
		try {
			FileInputStream fis= new FileInputStream(filepath);
			 prop= new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static String getKey(String key) {
		return prop.getProperty(key);
	}
}
