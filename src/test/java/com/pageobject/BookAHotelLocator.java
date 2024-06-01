package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookAHotelLocator extends SelectHotelLocator {
	public static WebElement getFirstName() {
		return driver.findElement(By.id("first_name"));
	}

	public static WebElement getLastName() {
		return driver.findElement(By.id("last_name"));
	}

	public static WebElement getBillingAddress() {
		return driver.findElement(By.id("address"));
	}

	public static WebElement getCreditCardNo() {
		return driver.findElement(By.id("cc_num"));
	}

	public static WebElement getCreditCardType() {
		return driver.findElement(By.id("cc_type"));
	}

	public static WebElement getExpiryMonth() {
		return driver.findElement(By.id("cc_exp_month"));
	}

	public static WebElement getExpiryYear() {
		return driver.findElement(By.id("cc_exp_year"));
	}

	public static WebElement getCvvNumber() {
		return driver.findElement(By.id("cc_cvv"));
	}

	public static WebElement getBookNowButton() {
		return driver.findElement(By.id("book_now"));
	}

	public static WebElement getOrderNo() {
		return driver.findElement(By.id("order_no"));
	}
	
}
