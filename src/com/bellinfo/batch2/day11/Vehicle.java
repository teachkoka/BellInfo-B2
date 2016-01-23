package com.bellinfo.batch2.day11;

public interface Vehicle {
	public static final boolean isDriverRequired = true;
	 int minimumNoOfDrivers =1;
	
	void modeOfTransaportation();
	public abstract void typeOfFuel();

}
