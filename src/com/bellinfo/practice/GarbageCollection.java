package com.bellinfo.practice;

public class GarbageCollection {

	public static void main(String[] args) {
		
		System.out.println("Verifying");
        String str = new String("Koka Siva");
		str =null;
		GCEligibleObject gcObject = new GCEligibleObject();
		GarbageCollection gcollection = new GarbageCollection();
		//gcollection= null;
		gcObject.mtd();
		gcObject.mtd1();
		gcObject= null;
		
		System.gc();
	}
	
	protected void finalize(){
		System.out.println("Garbage collection called");
	}

}

class GCEligibleObject{
	private String name ="1232";
	private int x = 10;
	public void mtd(){
		System.out.println("some method");
	}
	
	public void mtd1(){
		System.out.println("some1 method");
	}
}
