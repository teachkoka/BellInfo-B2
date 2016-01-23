package com.bellinfo.practice;

public class GenericsScenarios {

	public static void main(String[] args) {
		Bucket<String> bucket = new Bucket<>();
		bucket.setT("Siva");
		Bucket<Double> bucket1 = new Bucket<>();
		bucket1.setT(10.00);
		System.out.println(bucket.getT());
		System.out.println(bucket1.getT());
	}

}


class Bucket<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public <K,V> boolean validate(){
		
		return true;
	}
	
}