package com.bellinfo.batch2.day11;

public class AbstractInterfaceExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Boeing();
		vehicle.modeOfTransaportation();
		vehicle.typeOfFuel();
		boolean b = vehicle.isDriverRequired;
		int count =vehicle.minimumNoOfDrivers;
		System.out.println("XXXXXXXXXXXXXX");
		Plane p = new Boeing();
		p.modeOfTransaportation();
		p.typeOfFuel();
		p.speed();
		p.noOfPassenger();
		
		
	}

}
