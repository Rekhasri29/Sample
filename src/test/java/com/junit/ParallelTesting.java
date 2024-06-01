package com.junit;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ParallelTesting {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.test();
		b.start();
		StringJoiner join = new StringJoiner(" ", "[", "]");
		join.add("Aiite");
		join.add("Aiite");
		join.add("Aiite");
		System.out.println(join);

		String s = "1296";
		int int1 = Integer.parseInt(s);
		System.out.println(int1);

		String s1[] = { "a", "b", "c" }; // a b c
		StringBuilder sb = new StringBuilder();
		sb.append(s1[0]);
		sb.append(" " + s1[1]);
		sb.append(" " + s1[2]);
		System.out.println(sb.toString());

		String s2 = "MAT";
		// data(s2,"");
		// System.out.println(s2);
		StringTokenizer a1 = new StringTokenizer(s2);
		int hashCode = a1.hashCode();
		System.out.println(hashCode);
		System.out.println(a1.nextToken());
	}

	public static void data(String c1, String c2) {
		if (c1.length() == 0) {
			System.out.println(c1);
			return;
		}
		for (int i = 0; i < c1.length(); i++) {
			char ch = c1.charAt(i);
			String c3 = c1.substring(0, i) + c1.substring(i + 1);
			data(c3, c2 + ch);
			System.out.println(c2 + ch);
		}

	}

}

class A {
	public void test() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println("test1");
	}
}

class B extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println("test2");
	}
}