package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FailedRerunAuto {
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
		System.out.println("Prints login");
	}
}
