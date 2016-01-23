package com.bellinfo.batch2.day15;

public class WrapperExamples {

	public static void main(String[] args) {
		int a=10,b=20;
		//Two ways to convert from int to Integer Object.
		//1 int to Integer Object.
		Integer integer = new Integer(a);
		//2 int to Integer Object.
		integer.valueOf(b);
		//Converting from Integer object to int
		int x =integer.intValue();
		//Converting from Integer Object to String
		String str = integer.toString();
		//Converting int to String
		String z = str.valueOf(x);
		//Converting Integer object to double
		double d = integer.doubleValue();
		//Converting String to Integer
		String realString = "123";
		Integer intgerReal = new Integer(realString);
		System.out.println(intgerReal);
		String realString1 = "asaksjalksjal";
		Integer intgerReal1 = new Integer(realString1);
		
		System.out.println(intgerReal1);

	}

}
