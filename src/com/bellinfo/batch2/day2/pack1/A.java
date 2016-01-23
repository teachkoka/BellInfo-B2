package com.bellinfo.batch2.day2.pack1;

public class A {
	
	public static void publicMtd(){
		System.out.println("Public accessible anywhere");
	}

	static void defaultMtd(){
		System.out.println("With in the package");
	}
	
	protected static void protectedMtd(){
		System.out.println("Accessible with in Package  and with extends outside package");
	}
	
	private static void privateMtd(){
		System.out.println("Private NOT accessible anywhere");
	}
	
	
}
