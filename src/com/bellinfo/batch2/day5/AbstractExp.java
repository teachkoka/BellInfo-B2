package com.bellinfo.batch2.day5;

public class AbstractExp {

	public static void main(String[] args) {
      ClassDog dog = new ClassDog();
      dog.noOfLegs();
      dog.sleep();
      
      AbstractAnimal animal = new ClassDog();
	animal.sleep();
	animal.noOfLegs();
	
	 AbstractAnimal animal2 = new ClassMonkey();
	 animal2.noOfLegs();
	 animal2.sleep();
	 	 	}

}
abstract class AbstractAnimal{
	 void sleep(){
		System.out.println("All animal Sleep 8 hrs");
	}
	abstract void noOfLegs();
}
class ClassDog extends AbstractAnimal {
	void noOfLegs() {
		System.out.println("Dog has 4 legs");
	}
}
class  ClassMonkey extends AbstractAnimal{
	void sleep(){
		System.out.println("Monkey sleeps 12hrs");
	}
	void noOfLegs() {
		System.out.println("Money has two legs");
	}
	
}