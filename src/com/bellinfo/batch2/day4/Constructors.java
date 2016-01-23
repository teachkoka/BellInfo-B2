package com.bellinfo.batch2.day4;

public class Constructors {

	public static void main(String[] args) {
		
	
		
		ConstructorExp2 conExp = new ConstructorExp2();
		ConstrutorExp ConstrutorExp = new ConstrutorExp(10,20);

	}

}

class ConstrutorExp{
	
	ConstrutorExp(){
		System.out.println("Inside ConstructorExp");
	}
	
	ConstrutorExp(int a){
		System.out.println("Single argument Constructor"+ a++);
	}
	
	ConstrutorExp(int b, int c){
		System.out.println("Two arguments Constructors"+ b++ + c--);
	}

}

class ConstructorExp2 extends ConstrutorExp{
	ConstructorExp2(){
		System.out.println(" inside ConstructorExp2");
	}
	
}
