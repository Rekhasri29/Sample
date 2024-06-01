package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotations {

	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeclass");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Before
	public void before() {
		System.out.println("before");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
}
