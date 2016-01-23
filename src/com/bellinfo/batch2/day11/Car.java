package com.bellinfo.batch2.day11;

public abstract class Car implements Vehicle{
   
	public void modeOfTransaportation(){
		System.out.println("Air");
	}
	
	public void typeOfFuel(){
		System.out.println("plane fuel");
	}
	
	abstract void noOfPassenger();
	abstract void mileage();

	
}
