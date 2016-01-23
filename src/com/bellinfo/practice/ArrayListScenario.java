package com.bellinfo.practice;

import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListScenario {

	public static void main(String[] args) {
		arrayMethod();
		arrayListMethod();
	}
	
	private static void arrayMethod(){
		int[] a = new int[5];
		
		for(int i=0;i<5;i++){
			a[i] =i;
		}
		
		for(int i=0;i<5;i++){
	//		System.out.print(a[i]);
		}
		
		
	}
	
	private static void arrayListMethod(){
		ArrayList<Integer> al = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<5;i++){
			set.add(null);
		}
		System.out.println(set.size());
        java.util.Iterator<Integer> x = set.iterator();
        
        while(x.hasNext()){
        	System.out.println(x.next());
        }
		
		for(int i=0;i<5;i++){
			al.add(null);
		}
		System.out.println(al.size());
		
		for(int i=0;i<5;i++){
			System.out.println(al.get(i));
			
		}
	}

}
