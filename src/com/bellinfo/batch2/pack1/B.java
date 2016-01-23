package com.bellinfo.batch2.pack1;

public class B {
   
	public static void main(String[] args){
		
		A obj= new A();
	//	obj.privateMethod();  not accessible
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();

		
	}
	
}
