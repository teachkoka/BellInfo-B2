package com.bellinfo.batch2.day4;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC c = new ClassC();
		c.methodA();
		c.methodB();
		c.methodC();

		
	}

}


class ClassA{
	
	public void methodA(){
		System.out.println("in Method A");
	}
}

class ClassB extends ClassA {
	public void methodB(){
		System.out.println("in Method B");
	}
	
}
class ClassC extends ClassB{
	public void methodC(){
		System.out.println("in Method C");
	}
	
}