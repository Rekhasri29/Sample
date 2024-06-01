package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestThree {
	@Parameters({"username", "password"})
	@Test
	public void test1(String name, String pass) {
		System.out.println(name);
		System.out.println(pass);
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
}
