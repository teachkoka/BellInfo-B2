package com.bellinfo.practice;

public class ExceptionExp1 {

	public static void main(String[] args) {
        mtd1();
		
	}

	private static void mtd1(){
		mtd2();
		
	}
	
	private static void mtd2(){
		mtd1();
		
	}
	
}
