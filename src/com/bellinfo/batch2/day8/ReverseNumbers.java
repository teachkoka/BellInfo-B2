package com.bellinfo.batch2.day8;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter count: ");
		int count = scan.nextInt();
		int[] intArray = new int[count];
	/*	
		for(int i=0;i<count;i++){
			intArray[i] = scan.nextInt();
		}*/
		int i=0;
		while(i<count){
			intArray[i] = scan.nextInt();
			i++;
		}
		
		/*for(int i=count-1; i>=0;i--){
			System.out.println(intArray[i]);
		}*/
		i=count-1;
		while(i>=0){
			System.out.println(intArray[i]);
			i--;
		}
		
		
		
		
	}

}
