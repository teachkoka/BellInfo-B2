package com.bellinfo.batch2.day6;

public class NestedExamples {

	public static void main(String[] args) {
		NestedExamples ns = new NestedExamples();
		NestedExamples.Abc abc = new NestedExamples.Abc();
		abc.mtd();
		
		NestedExamples.XYZ xyz = ns.new XYZ();
		xyz.mtd1();

	}
	
	static class Abc{
		void mtd(){
			
		}
	}
	
	class XYZ{
		void mtd1(){
			
		}
	}

}
