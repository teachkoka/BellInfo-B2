package com.bellinfo.batch2.day4;

/*Abstract class is class with Keyword abstract and it may or may not contain abstract methods and concerte methods*/

public class AbstractExample {

	public static void main(String[] args) {
		//You can create a reference variable 
		AbstractC c = null;
		//You can't instanstiate/create the object for the abstract class
		//c = new AbstractC();
		
		
	}

}

/*if you have atleast one dummy method then you must declare that class as abstract. */
abstract class AbstractA {
	
	AbstractA(){
		
	}
	
	public void mtd1(){
		System.out.println( "Method 1 in absract class");
		
	}
	
	abstract int mtd2();
}

/*Even if you don't have a dummy/empty methods you can still declare the class as abstract. 
 * This is one of the ways to stop from creating an object*/
abstract class AbstractB{
	
	public void conMtd1(){
		System.out.println("concerete Method in abstract class");
	}
	
	public void conMtd2(){
		
	}
}

abstract class AbstractC{
	//Constructor creation is allowed. But you can't create an object.
	public AbstractC(){
		
	}
	public abstract void conMtd1();	
	public abstract void conMtd2();
}

abstract class D extends C{
	public void conMtd1(){
		System.out.println("in D mtd1");
	}
	
	public void conMtd2(){
		System.out.println("in Mtd2 ");
	}
}

