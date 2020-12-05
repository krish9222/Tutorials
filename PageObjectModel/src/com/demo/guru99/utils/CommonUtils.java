package com.demo.guru99.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {
	
	public static String getBaseProperty(String key) {
		
		Properties props = new Properties();
		try {
			File f = new File("base-config.properties");
			FileInputStream fin = new FileInputStream(f);
			props.load(fin);
			
			return (String) props.get(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
