package com.bellinfo.batch2.day7.exceptions;

public class Senario1 {

	public static void main(String[] args) {
		method1();
		
	}
	
	private static void method1(){
		System.out.println("Inside method 1");
		method2();
		
	}
	
	private static void method2(){
		System.out.println("Inside method 2");
		method1();
	}

}
