package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelModify {
	public static void excelModify() {

		try {
			File file = new File(
					"C:\\\\Users\\\\Rekha M\\\\eclipse-workspace\\\\new\\\\MavenTest\\\\src\\\\test\\\\resources\\\\TestData\\\\TestFile.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet2");
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			String value = cell.getStringCellValue();
			if(value.equals("Selenium")) {
				cell.setCellValue("Java");
			}
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			wb.close();
			System.out.println("Print");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		excelModify();
	}
}
