package com.bellinfo.batch2.day7.exceptions;

import java.util.Scanner;

public class Scenario2 {

	public static void main(String[] args) {
		boolean isZero = true;
	  do{
		try{
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n1");
		int n1 = scan.nextInt();
		System.out.println("Enter n2");
		int n2 = scan.nextInt();
		int n3 = n2 /n1;
		System.out.println("result of division: "+n3);
		isZero = false;
		}
		catch(Exception e){
			System.out.println("Please enter non zero values");
		}
	  }while(isZero);
	}

}
