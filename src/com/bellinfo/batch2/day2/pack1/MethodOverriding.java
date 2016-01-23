package com.bellinfo.batch2.day2.pack1;

public class MethodOverriding {

	public static void main(String[] args) {
		Base1 b = new Base1();
		b.publicMethod();
		b.publicIntReturnMethod();
		b.protectedMethod();
		
		
		Sub s = new Sub();
		s.publicMethod();
		s.publicIntReturnMethod();
		s.protectedMethod();
		
		
		Base1 bs = new Sub();
		bs.publicMethod();
		bs.publicIntReturnMethod();
		bs.protectedMethod();
		
		
		
		
		/*Sub sb = (Sub) new Base1();
		sb.publicMethod();
		sb.publicIntReturnMethod();
*/
		
	}

}

class Base1  {
	
	public void publicMethod(){
		System.out.println("parent publicMethod");
	}
	
	private void privateMethod(){
		System.out.println("parent privateMethod");
	}
	
	protected void protectedMethod(){
		System.out.println("parent protectedMethod");
	}
	
	public int publicIntReturnMethod(){
		System.out.println("parent publicIntMethod 1");
	    return 1;
	}
	
	public int publicSuperMethod(){
		System.out.println("parent publicIntMethod 1");
	    return 1;
	}
	
}

class Sub extends Base1 {
	public void publicMethod(){
		System.out.println("parent publicMethod");
	}
	
	private int privateMethod(){
		System.out.println("parent privateMethod 1");
	    return 1;
	}
	
	protected void protectedMethod(){
		System.out.println("parent protectedMethod");
	}
	
	public int publicIntReturnMethod(){
		System.out.println("parent publicIntMethod 2");
	    return 1;
	}
	
	public int simpleSubMethod(){
		System.out.println("parent publicIntMethod 2");
	    return 1;
	}
	
}



