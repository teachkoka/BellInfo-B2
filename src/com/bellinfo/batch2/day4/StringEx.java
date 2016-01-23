package com.bellinfo.batch2.day4;

public class StringEx {

	public static void main(String[] args) {
		
		Hello h1 = new Hello(10,20);
		Hello h2 = new Hello(10,30);
		
		System.out.println(h1.toString());
		System.out.println(h1.hashCode());
		System.out.println(h2.toString());
		System.out.println(h2.hashCode());
		System.out.println(h1 == h2);
		System.out.println(h1.equals(h1));
	}

}

class Hello {
	int a, b;
	
	Hello(int a, int y){
		this.a =a;
		b=y;
			}/*
	
	public boolean equals(Object o){
		Hello h = (Hello) o;
		if(h instanceof Hello) {
			System.out.println(h.toString());
			return true;
		}
		else 
			return false;
			
	}*/
	
	
	
	
	
		
}


interface InterfaceClass{
	
	public static final int abc=10;
	
	
	void method1();
	public abstract void method2();
	
}