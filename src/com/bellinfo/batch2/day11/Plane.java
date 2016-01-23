package com.bellinfo.batch2.day11;

public abstract class Plane implements Vehicle{
   
	public void modeOfTransaportation(){
		System.out.println("Air");
	}
	
	public void typeOfFuel(){
		System.out.println("Plane fuel");
	}
	
	abstract void noOfPassenger();
	abstract void speed();
	
}
