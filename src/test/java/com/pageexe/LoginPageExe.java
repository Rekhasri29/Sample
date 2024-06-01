package com.pageexe;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pageobject.BookAHotelLocator;
import com.pageobject.LoginPageLocator;

public class LoginPageExe extends BookAHotelLocator {
	public static void username() {
		BaseClass.inputData(LoginPageLocator.getUsername(), BaseClass.reuseExcel(1, 0));
	}

	public static void password() {
		BaseClass.inputData(LoginPageLocator.getPassword(), BaseClass.reuseExcel(1, 1));
	}

	public static void login() {
		BaseClass.clickData(LoginPageLocator.getLogin());
	}
}
