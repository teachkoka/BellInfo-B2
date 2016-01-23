package com.bellinfo.batch3.day10;

public class Parent {

	private Parent(){
		
		System.out.println("Parent default constructor called");
	}
	
	
	int x =12;
	public void house(){
		System.out.println("Parent having house");
	}
	
	public int property(){
		System.out.println("Parent property");
		return 1;
	}
}
