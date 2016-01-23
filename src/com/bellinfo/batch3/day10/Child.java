package com.bellinfo.batch3.day10;

public class Child  {
	
	
	Child(){
		
		System.out.println("Child Default Constructor");	
	}
	
	Child(int x){
		
		System.out.println("Child Argument Constructor");
	}

	//if parent having public then child must have public
	//if parent having protected then child can have either public or protected
	//if parent having default then child can have either public, protected, or default.
	public int property(){
		System.out.println("Child earned his own proeprty");
		return 3;
	}
	
	
	public void job(){
		System.out.println("Child having a job");
	}
	
	public int job(int salary){
		
		System.out.println("Salary "+salary);
		return salary;
	}
	
	public int job(double salary){
		
		System.out.println("Salary "+ salary);
		return 0;
	}
		
	
}
