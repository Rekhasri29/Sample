package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver = null;
	public static Select select = null;
	
	@BeforeClass
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}

	public static void inputData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void threadSleep(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //to handle exceptions and errors
		}
	}

	public static void clickData(WebElement element) {
		element.click();
	}

	public static void clearMethod(WebElement element) {
		element.clear();
	}

	public static void selectByValue(WebElement element, String data) {
		select = new Select(element);
		select.selectByValue(data);
	}

	public static void selectByVisibleText(WebElement element, String data) {
		select = new Select(element);
		select.selectByVisibleText(data);
	}

	public static void getAttributeMethod(WebElement element, String attributeName) {
		String attributeValue = element.getAttribute(attributeName);
		System.out.println(attributeValue);
	}

	public static String reuseExcel(int i, int j) {
		String value = null;

		try {
			File file = new File(
					"C:\\Users\\Rekha M\\eclipse-workspace\\new\\MavenTest\\src\\test\\resources\\TestData\\TestFile.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
					value = sm.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue; //Narrowing Casting -> converting a larger type to a smaller size type. double -> float -> long -> int -> char -> short -> byte.
					value = String.valueOf(l); //need to convert long to String so using valueOf()
					System.out.println(value);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
