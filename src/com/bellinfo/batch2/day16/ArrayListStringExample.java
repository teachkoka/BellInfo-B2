package com.bellinfo.batch2.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListStringExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		
		LinkedList<String> ll = new LinkedList<>();
		ll.addFirst("CHG");
		ll.add("CA");
		ll.addLast("VA");
		ll.addFirst("BAT");
		ll.add("NYC");
		
		for(String str:ll){
			System.out.println(str);
		}
		
		
		al.add("Red");
		al.add("Yellow");
		al.add("Green");
		al.add("Orange");
		al.add("Red");
		
		ArrayList<String> alExtra = new ArrayList<String>(50);
		alExtra.addAll(al);
		
/*		alExtra.add("purple");
		alExtra.add("pink");
		alExtra.add("sky blue");*/
		
		alExtra.contains("purple");
//		
//		if(alExtra.equals(al))
//			System.out.println("both equal");
//		else 
//			System.out.println("Not equal");
//		
		
		Iterator<String> itr = al.iterator();
		al.addAll(alExtra);
		al.clear();
		
		System.out.println("Using iterator");
	      while(itr.hasNext()){
	    	//  al.add("gggg");
	    	//  al.remove("Red");
	    	  String color = itr.next();
	    	  System.out.println(color);
	      }
		
		
/*	System.out.println("Using typical for loop");	
  for(int i=0;i<al.size();i++){
	  String color = al.get(i);
	  System.out.println(color);
  }
	
  System.out.println("Advanced for loop");
  for(String str:al){
	  System.out.println(str);
  }*/
		
	}

}
