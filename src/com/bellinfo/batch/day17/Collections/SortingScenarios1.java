package com.bellinfo.batch.day17.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortingScenarios1 {

	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<>();
		TreeSet<Double> ts = new TreeSet<>();
		al.add(23.23);
		al.add(13.23);
		al.add(23.13);
		al.add(2.23);
		
		Collections.sort(al);
		
	
		
		ts.addAll(al);
		for(double d:ts){
			System.out.print(d+" ");
		}

	}

}
