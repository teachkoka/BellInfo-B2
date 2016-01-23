package com.bellinfo.batch2.day5;

public class InterfaceExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.methodRun();
		d.methodSleep();

		Animal a = new Dog();
		System.out.println("*** With Interface Reference Variable");
		a.methodRun();
		a.methodSleep();
	}

}
interface Animal{
	
	void methodSleep();
	void methodRun();
}
class Dog implements Animal{

	public void methodSleep() {
		System.out.println("Dog Sleep");
	}

	public void methodRun() {
		System.out.println("Dog Run");
	}
	 
}
class Cat{
	
	public void methodSleep() {
		System.out.println("Cat Sleep");
	}
	public void methodRun() {
		System.out.println("Cat Run");
	}
}
