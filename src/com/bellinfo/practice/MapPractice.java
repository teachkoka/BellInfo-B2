package com.bellinfo.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		
		HashMap<MapExample, String> m = new HashMap<>();
		
		MapExample me = new MapExample();
		me.setName("IND");
		me.setRank(1);
		MapExample me1 = new MapExample();
		me1.setName("IND");
		me1.setRank(2);
		
		m.put(me, "XYZ");
		m.put(me1, "ABC");
		
		for(Map.Entry<MapExample, String> entry:m.entrySet()){
		   MapExample mapExam = entry.getKey();
		   String str = entry.getValue();
		   System.out.println("MapExample Key "+ mapExam + " Value "+ str);
		   
			
		}
	}

}

class MapExample {
	private String name;
	private int rank;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "MapExample [name=" + name + ", rank=" + rank + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapExample other = (MapExample) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	
	
	
}