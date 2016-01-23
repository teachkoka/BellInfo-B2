package com.bellinfo.batch.day17.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class SortingScenarios3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Asian> al = new ArrayList<Asian>();
		
		Vector<Asian> v = new Vector<>();
		
		Asian a1 = new Asian();
		a1.setName("IND");
		a1.setDebt(1000);
		
		Asian a2 = new Asian();
		a2.setDebt(1500);
		a2.setName("CHINA");
		
		Asian a3 = new Asian();
		a3.setDebt(1500);
		a3.setName("JAPAN");
		
		Asian a4 = new Asian();
		a4.setDebt(1300);
		a4.setName("IND");
		
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		
		Collections.sort(al, new DebtPriorityBasedComparision());
		
		for(Asian a:al){
			System.out.println(a);
		}
		
		
}
}

class NamePriorityBasedComparision implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Asian as1 = (Asian)o1;
		Asian as2 = (Asian)o2;
		
		int x = as1.getName().compareTo(as2.getName());
		if(x==0){
			x =as1.getDebt()-as2.getDebt();
		}
		return x;
	}
	
}

class DebtPriorityBasedComparision implements Comparator{


	public int compare(Object o1, Object o2) {
		Asian as1 = (Asian)o1;
		Asian as2 = (Asian)o2;
		int x = as1.getDebt()-as2.getDebt();
		if(x == 0){
			x = as1.getName().compareTo(as2.getName());	
		}
		
		return x;
	}
	
	
}


class Asian{
	private String name;
	private int debt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDebt() {
		return debt;
	}
	public void setDebt(int debt) {
		this.debt = debt;
	}
	
	public boolean equals(Object o){
		if(o instanceof Asian){
			Asian as = (Asian)o;
			if(this.getName().equals(as.getName())&&
					this.getDebt() == as.getDebt())
				return true;
		}
		return false;
	}
	
	public String toString(){
		return "Name " + getName()+" Debt "+getDebt();
	}
	
}