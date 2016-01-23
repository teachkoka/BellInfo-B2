package com.bellinfo.batc2.day13.exceptions;

public class GCExample {
    int x= 25;
    String xyz = new String("SASASSAsakdsajfoiaczcvkzcjofjasaczkmcsmovjsjzkmvkz");
	
	public static void main(String[] args) {
		GCExample gce = new GCExample();
		gce.xyz.concat("sasasa dhsdjs sasa ");
		gce.mtd1();
		gce.mtd2();
		//gce =null;
		
		System.gc();
		Runtime.getRuntime().gc();
		//gce.mtd1();

	}
	private void mtd1(){
		System.out.println("I'm in method 1");
	}
	private void mtd2(){
		System.out.println("I'm in method 2");
	}
	public void finalize(){
		System.out.println("finalize before GC collection");
	}
}
