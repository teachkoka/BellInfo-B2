package com.bellinfo.batch2.day7.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		
		try{
		System.out.println("Enter n1");
		int n1 = scan.nextInt();
		System.out.println("Enter n2");
		int n2 = scan.nextInt();
		 method1(n1,n2);
		
		System.out.println("successfully Entered values in to Array");
		}catch(ArithmeticException ae){
			System.out.println("You're entered zero value for n1 and which is not allowed.");
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException aio){
			System.out.println("Your program need to be corrected. "
					+ "You are entering morethan initialized size");
			aio.printStackTrace();
		}catch(InputMismatchException ime){
			System.out.println("Please enter only integer values");
			ime.printStackTrace();
		}catch(Exception e){
			System.out.println("Temporaily not avaliable");
		}
		finally{
			System.out.println("I will execute all the time");
		}
		
	}
	
	public static int method1(int a, int b) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		int n3= b/a;
		System.out.println("result "+n3);
		method2(a, b);
		
		return n3;
	}
	
	public static void method2(int a,int b) throws ArrayIndexOutOfBoundsException{
		int[] inputArray = new int[2];
		inputArray[0]=a;
		inputArray[1]=b;
		inputArray[2]=a;
	}

}
