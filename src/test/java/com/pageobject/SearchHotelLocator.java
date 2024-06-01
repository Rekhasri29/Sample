package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotelLocator extends LoginPageLocator {
	public static WebElement getLocation() {
		return driver.findElement(By.id("location"));
	}

	public static WebElement getHotels() {
		return driver.findElement(By.id("hotels"));
	}

	public static WebElement getRoomType() {
		return driver.findElement(By.id("room_type"));
	}

	public static WebElement getNumberOfRooms() {
		return driver.findElement(By.id("room_nos"));
	}

	public static WebElement getClearCheckIn() {
		return driver.findElement(By.id("datepick_in"));
	}

	public static WebElement getCheckInDate() {
		return driver.findElement(By.id("datepick_in"));
	}

	public static WebElement getClearCheckOut() {
		return driver.findElement(By.id("datepick_out"));
	}

	public static WebElement getCheckOutDate() {
		return driver.findElement(By.id("datepick_out"));
	}

	public static WebElement getAdultsPerRoom() {
		return driver.findElement(By.id("adult_room"));
	}

	public static WebElement getChildrenPerRoom() {
		return driver.findElement(By.id("child_room"));
	}

	public static WebElement getSubmitButton() {
		return driver.findElement(By.id("Submit"));
	}
}
