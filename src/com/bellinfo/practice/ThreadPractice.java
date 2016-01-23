package com.bellinfo.practice;

public class ThreadPractice {

	public static void main(String[] args) {
      new MyThread("Core Java");
      new MyThread("Advanced Java");
      for(int i=0;i<10;i++){
    	  System.out.println("I'm trying something here");
    	  try{
    		  Thread.sleep(1000);
    	  }catch(InterruptedException ie){
    		  System.out.println("Interupted");
    	  }
      }
	}

}


class MyThread extends Thread{
	static int x =99;
	public MyThread(String tname){
		setName(tname);
		start();
	}
	
	public void run(){
		for(int i=0;i<=10;i++){
			x++;
			System.out.println(x +"...."+getName());
		
				if(getName().equals("Core Java"))
				stop();
			
		}
		
	}
}
