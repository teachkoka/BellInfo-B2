package com.bellinfo.batch2.day14;

public class ThreadsExamples {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = Thread.currentThread();
		Thread td = new Thread();
		Thread td1 = new Thread();
		td.setName("java");
		System.out.println(t.getState());
		td.sleep(10000);
		System.out.println(td1.getState());
		
		System.out.println("Thread Name: "+ t.getName() );
		System.out.println("td Name: "+ td.getName());
		System.out.println("td1 Name: "+ td1.getName());
		
		for(int i=0;i<=5;i++){
			Thread.sleep(100);
			//System.out.println("first for loop");
			}
		for(int i=0;i<=5;i++){
			Thread.sleep(50);
			//System.out.println("second for loop");
		}
	}

}
