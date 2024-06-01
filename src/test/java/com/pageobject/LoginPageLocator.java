package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class LoginPageLocator extends BaseClass {
	public static WebElement getUsername() {
		return driver.findElement(By.id("username"));
	}

	public static WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}

	public static WebElement getLogin() {
		return driver.findElement(By.id("login"));
	}
}
