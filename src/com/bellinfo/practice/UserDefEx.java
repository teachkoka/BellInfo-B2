package com.bellinfo.practice;

import java.util.Scanner;

public class UserDefEx {

	public static void main(String[] args)  {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your 16 digit credit Card number");
		String ccNo = scan.nextLine();
		try{
			method1(ccNo);
		}catch(CCExp cc){
			System.out.println(cc.toString());
		}
		

	}
	
	private static void method1(String ccNo) throws CCExp{
		 if(ccNo.length()==16){
			 System.out.println("Your Entered 16 digit number accepted.We will send your order");
			 
		 }else{
			 
			 throw new CCExp(ccNo);
		 }
		
		
	}

}


class CCExp extends Exception{
	  String cc;
	  
	  CCExp(){
		  System.out.println("Please enter valid 16 digits");
	  }
	  
	  CCExp(String cc){
		  super();
		  this.cc = cc;
		  System.out.println("Please enter valid 16 digits " + cc);
	  }
	  
	  public String toString(){
		  return "Please enter 16 digits. You entered "+ cc + "   digits. which is incorrect";
	  }
	
	
}

