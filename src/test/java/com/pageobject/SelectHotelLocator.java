package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectHotelLocator extends SearchHotelLocator {
	public static WebElement getSelect() {
		return driver.findElement(By.id("radiobutton_0"));
	}

	public static WebElement getContinueButton() {
		return driver.findElement(By.id("continue"));
	}
}
