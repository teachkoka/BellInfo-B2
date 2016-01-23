package com.bellinfo.batch2.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayExample15 {

	public static void main(String[] args) {
		Student[] studArray = new Student[4];
		Student s0 = new Student();
		s0.setName("Satya");
		s0.setRollno(100);
		Student s1 = new Student();
		s1.setName("Siva");
		s1.setRollno(101);
		Student s2 = new Student();
		s2.setName("Rakesh");
		s2.setRollno(102);
		Student s3 = new Student();
		s3.setName("Vinay");
		s3.setRollno(103);
		studArray[0]= s0;
		studArray[1]= s1;
		studArray[2]= s2;
		studArray[3]= s3;
		for(int i=0;i<studArray.length;i++){
			System.out.println(studArray[i]);
		}
ArrayList<String> al = new ArrayList<>();
al.add("Red");
al.add("Yellow");
al.add("Green");

Iterator<String> iterator = al.iterator();

while(iterator.hasNext()){
	System.out.println(iterator.next());
}

for(int i=0;i<al.size();i++){
	System.out.println(al.get(i));
}

for(String str:al){
	System.out.println(str);
}


	}
	
	

}

class Student{
	String name;
	int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String toString(){
		return "Name: "+this.name+" Roll Number: "+this.rollno;
	}
}