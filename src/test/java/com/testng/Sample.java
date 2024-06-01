package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite");
	}
}
