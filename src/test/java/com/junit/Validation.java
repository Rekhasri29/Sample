package com.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

//3 Methods in Assert class
//1. assertEquals(expected, actual)
//2. assertTrue()
//3. assertFalse()

public class Validation {
	@Test
	public void test1() {
		String s = "Aiite";
		// expected-actual

		// assertEquals - if expected and actual are null, they are equal.
		Assert.assertEquals(s, "Aiite");
		System.out.println("test1");
	}

	@Ignore
	@Test
	public void test2() {
		String s = "Aiite";
		Assert.assertTrue(s.contains("A"));
		System.out.println("test2");
	}
	
//	@Test
//	public void test4() {
//		String s = "Aiite";
//		Assert.assertTrue(s.contains("a"));
//		System.out.println("test4");
//	}


	@Test
	public void test3() {
		String s = "Aiite";
		Assert.assertFalse(s.contains("a"));
		System.out.println("test3");
	}
}
