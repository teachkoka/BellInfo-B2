package com.bellinfo.practice;

import java.util.Scanner;

public class ExceptionExp2 {

	public static void main(String[] args) {
		

	       boolean isZero = true;
	       
	     do{
	    	 try{
	  		   Scanner scan = new Scanner(System.in);
		       System.out.println("Please enter N1 value: ");
		       int n1 = scan.nextInt();
		       System.out.println("Please enter N2 value: ");
		       int n2 = scan.nextInt();
	    		  int n3 = n2/n1;
	    		  System.out.println("N3 value is: "+n3);
	    		  isZero = false;
	    	 }
	    	 catch(Exception e){
	    		 System.out.println("please enter non-zero value");
	    	 }
	    	 
	     }while(isZero);
	     
		
	}

}
