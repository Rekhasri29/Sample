package com.testng;

import org.testng.annotations.Test;

public class Include {
	@Test(priority = -1)
	public void user() {
		System.out.println("username");
	}

	@Test(priority = 2)
	public void pass() {
		System.out.println("password");
	}
	
	@Test(priority = 3)
	public void loginButton() {
		System.out.println("loginbutton");
	}
}
