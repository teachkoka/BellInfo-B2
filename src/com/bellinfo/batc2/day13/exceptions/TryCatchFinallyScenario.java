package com.bellinfo.batc2.day13.exceptions;

public class TryCatchFinallyScenario {

	public static void main(String[] args) {
		
		int x = mtd(10,0);
System.out.println(x);
	}
	
	private static int mtd(int a, int b){
		int c=0;
		try{
			 c = a/b;
			return c;		
		}catch(ArithmeticException ae){
			System.out.println("exception");
		}
		finally{
			System.out.println("always executes");
		}
		return c;
		
	}

}
