package com.aprilproject;

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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Select select;
	public static Actions act;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rekha M\\eclipse-workspace\\new\\MavenTest\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
	}
	

	public static void threadSleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void input_Text(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void selectByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element, String value) {
		select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void getattribute(WebElement element,String attributeName) {
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
				//String - getStringCellValue()
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				//Date -> isCellDateFormatted()-> getDateCellValue() -> SimpleDateFormat()

				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
					value = sm.format(dateCellValue);
					System.out.println(value);
				} else {
					//Number -> getNumericCellValue() -> numericCellValue() -> valueOf()
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		return value;
	}

}
