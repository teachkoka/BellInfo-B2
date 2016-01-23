package com.bellinfo.batch2.day16;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingExample {
	
	public static void main(String[] args){

		   ArrayList<Double> doubleList = new ArrayList<>();
		   TreeSet<Double> s = new TreeSet<Double>();
		   HashSet<Double> hs = new HashSet<Double>();
		   doubleList.add(22.65);
		   doubleList.add(12.25);
		   doubleList.add(22.23);
		   doubleList.add(23.65);
		   doubleList.add(21.65);
		   doubleList.add(null);
		   for(double d:doubleList){
			   System.out.print(" "+d);
		   }
		   System.out.println();
		   hs.addAll(doubleList);
		   s.addAll(doubleList);
		   for(double d:s){
			   System.out.print(" "+d);
		   }
		
		   Collections.sort(list);
		
		   ArrayList<Country1> al = new ArrayList<>();
		   HashSet<Country1> hs1 = new HashSet<>();
		   TreeSet<Country1> ts = new TreeSet<>();
		   
		   Country1 c1 = new Country1();

		   Country1 c2 = new Country1();
		   Country1 c3 = new Country1();
		   
		   c1.setName("IND");
		   c1.setNumber(3);
		   c1.setName("CHINA");
		   c1.setNumber(1);
		   c1.setName("USA");
		   c1.setNumber(2);
		   
		   
		
		
	}
   
   
   
   
  
   
   
	
}

class Country1 implements Comparable<Country1>{

	String name;
	int number;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int compareTo(Country1 o) {
		
		return 0;
	}

	
	
}
