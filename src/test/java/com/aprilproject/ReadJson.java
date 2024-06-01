package com.aprilproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	public static void reuseReadJson() {
		try {
			File file = new File(
					"C:\\Users\\Rekha M\\eclipse-workspace\\new\\MavenTest\\src\\test\\resources\\file.json");
			FileReader read = new FileReader(file);
			JSONParser obj = new JSONParser();
			Object object = obj.parse(read);
			JSONObject jobj = (JSONObject) object;
			String name = (String) jobj.get("name");
			System.out.println(name);
			String value = (String) jobj.get("value");
			System.out.println(value);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		reuseReadJson();
	}
}
