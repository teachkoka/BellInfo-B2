package com.bellinfo.batch2.day2.pack1;

public class MethodOverloading {

	public static void main(String[] args){
		Base base = new Base();
		base.mtd1('a');
		
		
	}
	
	
	
}

/**
 * 
 * @author kaizen
 * Number of parameters
 * Type of Parameters
 * Order of parameters should be different in order to overload a method.
 *
 */
class Base {
	
	int a = 10;
	int b = 20;
	
	public void mtd1(int x){
		System.out.println("single int argument mtd1");
	}
	
	public void mtd1(int y, int a){
		System.out.println("two integer argument constructor");
		
	}
	
	public int mtd1(char c){
		System.out.println("single char argument constructor");
		return 1;
	}

		
}



