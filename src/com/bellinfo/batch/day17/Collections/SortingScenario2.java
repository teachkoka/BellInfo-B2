package com.bellinfo.batch.day17.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortingScenario2 {
    public static void main(String[] args){
    	
    	ArrayList<BRICS> bricsList = new ArrayList<BRICS>();
    	BRICS b1 = new BRICS();
    	BRICS b2 = new BRICS();
    	BRICS b3 = new BRICS();
    	BRICS b4 = new BRICS();
    	BRICS b5 = new BRICS();
    	
    	b1.setCountryName("IND");
    	b1.setRank(3);
    	
    	b2.setCountryName("USA");
    	b2.setRank(1);
    	
    	b5.setCountryName("USA");
    	b5.setRank(1);
    	
    	b3.setCountryName("CHI");
    	b3.setRank(2);
    	
    	b4.setCountryName("JAPAN");
    	b4.setRank(4);
    	
    	bricsList.add(b1);
    	bricsList.add(b2);
    	bricsList.add(b3);
    	bricsList.add(b4);
    	bricsList.add(b5);
    	Collections.sort(bricsList);
        TreeSet<BRICS> ts = new TreeSet<>();
    	ts.addAll(bricsList);
    	for(BRICS b:ts){
    		System.out.println(b);
    	}
    	
    	
    	
    }
}
class BRICS implements Comparable{
	private String countryName;
	private int rank;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
/*	public boolean equals(Object o){
		if(o instanceof BRICS){
			BRICS bCountry = (BRICS) o;
			if(this.getCountryName().equals(bCountry.getCountryName()) &&
					this.getRank() == bCountry.getRank()){
				return true;
			}
		}
		return false;
	}*/
	
	public String toString(){
		return "Country Name "+getCountryName()+" rank "+getRank();
	}
	
	public int compareTo(Object o) {
		BRICS bCountry = null;
		if(o instanceof BRICS){
			bCountry = (BRICS) o;
		}
		return this.getRank()- bCountry.getRank();
	}
	
	
	
	
}