package com.bellinfo.batch2.day15;

public class Bucket {

	public static void main(String[] args) {
		
		GenricExamp<Integer> ge = new GenricExamp<>();
		ge.setA(10);

		System.out.println(ge.getA());
	}

}

class GenricExamp<T>{
	
	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	
}
