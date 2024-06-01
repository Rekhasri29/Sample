package com.testng;

import org.testng.annotations.Test;

public class TestGroup1 {
	@Test(groups = { "smoke", "reg" }) // {} - return typs of groups is String array
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = { "sanity", "reg" })
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups = { "smoke", "reg" })
	public void test3() {
		System.out.println("test3");
	}
}
