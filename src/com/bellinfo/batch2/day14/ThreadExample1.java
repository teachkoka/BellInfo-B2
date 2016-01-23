package com.bellinfo.batch2.day14;

public class ThreadExample1 {

	public static void main(String[] args) {
		UserThread t1 = new UserThread("Core Java");
		UserThread t2 = new UserThread("Advanced Java");
	}

}

class UserThread extends Thread{
	
	public UserThread(String tname){
		setName(tname);
		start();
	}
	
	public void run(){
		for(int i=0;i<=5;i++){
			try {
				if(getName().equals("Core Java")){
					UserThread.sleep(3000);
					System.out.println("Thread name " +getName() + " count: "+i );
					
				}else{
					System.out.println("Thread name " +getName() + " count: "+i );
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

