package com.bellinfo.batch2.day4;

public class SimpleInheritance {

	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		sub.baseMethod();
		sub.subMethod();
		

	}

}

class BaseClass{
	
	public void baseMethod(){
		System.out.println("Base Metod");
	}
	
}

class SubClass extends BaseClass {
	
	public void subMethod(){
		System.out.println("Sub Class Method");
	}
	
	
	
}