package com.aprilproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	public static String reuseReadProp(String data) {
		String value = null;

		try {
			FileReader read = new FileReader(new File(
					"C:\\Users\\Rekha M\\eclipse-workspace\\new\\MavenTest\\src\\test\\resources\\config.properties"));
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			System.out.println(value);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;

	}

	public static void main(String[] args) {
		reuseReadProp("username");
		reuseReadProp("password");
	}
}
