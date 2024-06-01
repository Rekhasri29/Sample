package com.aprilproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageLocators extends BaseClass{

	public static WebElement byId(String value) {
		return driver.findElement(By.id(value));
	}

	public static WebElement byName(String value) {
		return driver.findElement(By.name(value));
	}

	public static WebElement byTagName(String value) {
		return driver.findElement(By.tagName(value));
	}

	public static WebElement byClassName(String value) {
		return driver.findElement(By.className(value));
	}

	public static WebElement byXpath(String value) {
		return driver.findElement(By.xpath(value));
	}

	public static WebElement byLinkText(String value) {
		return driver.findElement(By.linkText(value));
	}

	public static WebElement byPartialLinkText(String value) {
		return driver.findElement(By.partialLinkText(value));
	}

	public static WebElement byCssSelector(String value) {
		return driver.findElement(By.cssSelector(value));
	}
	
}
