package com.bellinfo.batch2.day3;

public class VariableAccessSpecifiersValiadtion {

	public int publicVar=10;
	private int privateVar =10;
	protected int protectedVar=10;
	int defaultVar =10;

	static int staticVar=10;
	final int finalVar=10;
	
	
	public static int publicStaticVar = 10;
	private static int privateStaticVar = 10;
	protected static int protectedStaticVar = 10;
	static int defaultStaticVar =10;
	
	
	public final int publicFinalVar = 10;
	private final int privateFinalVar = 10;
	protected final int protectedFinalVar = 10;
	final int defaultFinalVar =10;
	
	public static final int publicStaticFinalVar =10;
	private static final int privateStaticFinalVar =10;
	protected static final int protectedStaticFinalVar =10;
	static final int staticFinalVar =10;
	
	private Course course=null;
	public static Course staticCourse=null;
	public static final Course staticFinalcourse=new Course();
	
	
	public static void main(String[] args){
				/*Only final is allowed.*/
		int localVairable;
		//System.out.println(localVairable);
		int defaultVar =10;
		final int finalVar =10;
		final Course staticFinalcourseMethodLevel=new Course();
		staticFinalcourse.x=15;
		staticCourse = staticFinalcourse;
		System.out.println("staticFinalcourse. x value:"+ staticFinalcourse.x);
		VariableAccessSpecifiersValiadtion vasv = new VariableAccessSpecifiersValiadtion();
		vasv.publicmMthod();
		publicStaticMthod();
		//System.out.println(staticBlockVar);
	}
	
	static{
		int staticBlockVar =25;
		System.out.println("Calling from Static Block");
	}
	
	
	public void publicmMthod(){
		publicStaticMthod();
		Course course = new Course();
		course.method();
		
	}
	private void privateMethod(){}
	protected void protectedMethod(){}
	void defaultMethod(){}
	
	public static void publicStaticMthod(){
		
		int x = 20;
		
		
	}
	

	private static void privateStaticMethod(){
		System.out.println("Calling from Static Block");
	}
	
	protected void protectedStaticMethod(){}
	static void defaultStaticMethod(){}
	
	public final void publicFinalMthod(){}
	private final void privateFinalMethod(){}
	protected final void protectedFinalMethod(){}
	final void defaultFainlaMethod(){}
	
	public static final void publicFinalStaticMthod(){}
	private static final void privateFinalStaticMethod(){}
	protected static final void protectedFinalStaticMethod(){}
	static final void defaultFainlaStaticMethod(){}
	
	
}


final  class Course{
	
	int x=10;
	
	public void method(){
		System.out.println("inside final method");
	}
	
	
}
