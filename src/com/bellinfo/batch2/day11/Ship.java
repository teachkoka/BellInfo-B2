package com.bellinfo.batch2.day11;

public abstract class Ship implements Vehicle{
   
	public void modeOfTransaportation(){
		System.out.println("Water");
	}
	
	public void typeOfFuel(){
		System.out.println("ship fuel");
	}
	
	abstract void noOfPassenger();
	abstract void timing();

	
}
