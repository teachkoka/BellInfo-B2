package com.bellinfo.batch2.day16;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> hs = new TreeSet<>();
		hs.add("RED");
		hs.add("YELLOW");
		hs.add("GREEN");
		hs.add("ORANGE");
		hs.add("RED");
		hs.add("YELLOW");
		
		for(String str:hs){
			System.out.println(str);
		}
	
	}

}
