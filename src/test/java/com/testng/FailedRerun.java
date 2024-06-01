package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class FailedRerun {
	@Test(retryAnalyzer = FailedTestCaseRerun.class)
	public void user() {
		String s = "Aiite";
		Assert.assertEquals(s, "Aiite");
		System.out.println("print line");
	}
	
	@Test
	public void pass() {
		System.out.println("password");
		String s = "Aiite";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(s, "Aiit");
		System.out.println("Prints pass");
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
