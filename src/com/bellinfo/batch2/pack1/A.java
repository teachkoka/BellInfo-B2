package com.bellinfo.batch2.pack1;

public class A {

	private static void privateMethod(){
		System.out.println("private accessable");
	}
	static void  defaultMethod(){
		System.out.println("Default accessable");
		}
	protected static void protectedMethod(){
		System.out.println("Protected accessable");
	}
	public static void publicMethod(){
		System.out.println("Public accessable");
	}
}
