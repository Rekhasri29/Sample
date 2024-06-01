package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FailedTestCases {
	// Assert -> Hard Assert and Soft Assert
	// Hard Assert -> Assert Class -> assertEquals, assertTrue and assertFalse.
	// SoftAssert -> SoftAssert Class -> create new memory allocation and use
	// assertAll.

	@Test
	public void user() {
		String s = "Aiite";
		Assert.assertEquals(s, "Aiit");
		System.out.println("print line");
		
	}

	@Test
	public void pass() {
		System.out.println("password");
	}

	@Test
	public void loginbutton() {
		String s = "Aiite";
		SoftAssert sa = new SoftAssert();
		sa.assertAll();
		sa.assertEquals(s, "Aiite");
		System.out.println("Print login");
		sa.assertEquals(s, "Aiite");
		System.out.println("loginbutton");
		sa.assertEquals(s, "Aiit");
		System.out.println("wrong");
	}
}
