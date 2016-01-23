package com.bellinfo.batch2.day2.pack1;

public class ConstructorExample {
	
	public static void main(String[] args){
		final  AConstructor ac = new AConstructor(1,2);
		ac.a =10;
		System.out.println(ac.a);
		int a[] = new int[]{1,2,3,4};
		a[3]=5;
		
		for(int i=0; i<=3; i++){
			System.out.println(a[i]);
		}
		
		AbstractClass ac = new AbstractClass();
	}

}


abstract class AbstractClass {
	
	AbstractClass(){
		System.out.println("abass");
	}
	
	
}

class AConstructor {
	 int a,b;
	
	AConstructor(int a, int b){
		System.out.println(a + b);
	}
	
	void mtd(){
		System.out.println("simple method");
	}
	
}

