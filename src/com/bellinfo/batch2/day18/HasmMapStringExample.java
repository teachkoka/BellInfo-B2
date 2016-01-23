package com.bellinfo.batch2.day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasmMapStringExample {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		
		hm.put("A", "Apple");
		hm.put("B", "Ball");		
		hm.put("C", "Cat");
		hm.put("D", "Dog");		
		hm.put("E", "Egg");		
		
		ArrayList<String> alA = new ArrayList<String>();
		ArrayList<String> alB = new ArrayList<String>();
		ArrayList<String> alC = new ArrayList<String>();
		ArrayList<String> alD = new ArrayList<String>();
		ArrayList<String> alE = new ArrayList<String>();
		ArrayList<String> alX = new ArrayList<String>();
		alA.add("Apple");
		alA.add("Aeroplane");
		alB.add("Ball");
		alB.add("Bat");
		alC.add("Car");
		alC.add("Cat");
		alD.add("Dog");
		alD.add("Dolphin");
		alE.add("Egg");
		alE.add("Elephant");
        
		alX.add("Caught");
		alX.add("Catch");
		
		HashMap<String, ArrayList<String>> hmAlphabets = new HashMap<>();
		hmAlphabets.put("A", alA);
		hmAlphabets.put("B", alB);
		hmAlphabets.put("C", alC);
		hmAlphabets.put("D", alD);
		hmAlphabets.put("E", alE);
		hmAlphabets.put("C", alX);


		
		Iterator<String> itr1 = hmAlphabets.keySet().iterator();
		while(itr1.hasNext()){
			String key = itr1.next();
			ArrayList<String> al = hmAlphabets.get(key);
			System.out.println("key "+key+ " List "+ al);
		}
		System.out.println("********************");
		//Based on Entry retrieval with advanced for loop
		for(Map.Entry<String, String> entry:hm.entrySet()){
			 String key =  entry.getKey();
			 String value = entry.getValue();
			 System.out.println("Key: "+ key + " value "+value);
		}
		
		//Based on iterator
		
		Set<String> set =hm.keySet();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			String keyInHM =itr.next();
			String valueInHM = hm.get(keyInHM);
			System.out.print("key: "+keyInHM +" Value " +valueInHM +" :: ");
			
		}
		
		
		
	
	}

}
