package com.bellinfo.batch2.day15;

public class SynchronizationExample {

	public static void main(String[] args) {
		Increment inc = new Increment();
		Increment inc1 = new Increment();
		SyncSecnario1 coreThread = new SyncSecnario1("Core",inc);
		SyncSecnario1 advancedThread = new SyncSecnario1("Advanced", inc);
		
	}

}
class SyncSecnario1 implements Runnable{
	Increment icLocal;
	Thread t ;
	SyncSecnario1(String tName, Increment ic ){
		t= new Thread(this, tName);
		t.setName(tName);
		icLocal = ic;
		t.start();
	}
	
	public void run(){
		
		synchronized(icLocal){  //inc is for core  inc1 for advanced
			System.out.println("Thread started: "+t.getName() );
		icLocal.incMethod(t.getName());
		System.out.println("Thread ended: "+t.getName());
		}
	
	}
	
}

class Increment{
	static int a=0;
	public void incMethod(String name){
		for(int i=0;i<=5;i++){
			System.out.println("Increment class: Thread Name : "+ name + " count: "+a++);
		}
	}
}