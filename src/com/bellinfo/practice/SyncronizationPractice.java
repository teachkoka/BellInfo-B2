package com.bellinfo.practice;

public class SyncronizationPractice {
	public static void main(String[] args) {
       Counter1 c1 = new Counter1();
       SyncDemo sync = new SyncDemo("Core",c1);
       SyncDemo sync1 = new SyncDemo("Advanced",c1);
       
	}
}
class SyncDemo extends Thread{
	String tname;
	Counter1 counter;
	SyncDemo(String name, Counter1 counter){
		this.counter =counter;
		this.tname = name;
		setName(tname);
		start();
	}
	
	public void run(){
		System.out.println("starting Thread : "+getName());
		//synchronized(counter){
			counter.displayCounter(getName());
			new Counter1().display("Experiment");
			counter.display(getName());
		//}
		
		System.out.println("Thread "+ getName() + " execution completed");
		
	}
	
}

class Counter1{
	static int a =0;
	
	public synchronized void displayCounter(String name){
		for(int i=0;i<=5;i++)
			{
				System.out.println("Thread: "+name+" count: "+i);
			}
	}
	
	public void display(String name){
		for(int i=0;i<=5;i++)
			{
				System.out.println("Non Syncronized method in : "+name+" count: "+i + " a value: "+a);
			}
	}
}
