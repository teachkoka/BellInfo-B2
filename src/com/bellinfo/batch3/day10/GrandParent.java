package com.bellinfo.batch3.day10;

public class GrandParent {
    private final int fieldSize =5;
    
    GrandParent(){
    	
    	System.out.println("Grand Parent default Constructor");
    }
    
    GrandParent(int a){
    	System.out.println("Grand Parent single argument constructor " + a);
    }
    
    
	public void fields(){
		System.out.println(fieldSize+ " acres");
	}
	
	private void property(){
		System.out.println("5 acres land");
	}
}
