package com.bellinfo.batch2.day7;

public class StudentEqualsExample {

	public static void main(String[] args) {
		
		String str ="koka";
		str.concat(" Siva");
		
		StringBuilder sb = new StringBuilder("koka");
		sb.append(" Siva");
		
		StringBuffer sbuf = new StringBuffer("Koka");
		sbuf.append(" Siva");
		
		
		
		
		System.out.println(str);
		
		Address add1 = new Address();
		add1.setSuit_no(121);
		add1.setStreet("Astoria");
		add1.setCity("Herndon");
		add1.setPinCode(20170);
		
		Address add2 = new Address();
		add2.setSuit_no(121);
		add2.setStreet("San Moritz");
		add2.setCity("Herndon");
		add2.setPinCode(20170);
		
		Student stud1 = new Student();
		stud1.setName("Siva");
		stud1.setRollNumber(1234);
		stud1.setAddress(add1);
		
		Student stud2 = new Student();
		stud2.setName("Siva");
		stud2.setRollNumber(1234);
		stud2.setAddress(add2);
		
		Student[] studArray =new Student[2];
		studArray[0] = stud1;
		studArray[1] = stud2;
		Student stud = null;
		
		System.out.println("Retriving from Array");
		for(int i=0; i<2;i++){
			stud = studArray[i];
			System.out.println(stud);
		}
		
		
		if(stud1.equals(stud2)){
			System.out.println("Yes, both students are same."+" stud1 "+ stud1 + " stud2 " + stud2);
		}else{
			System.out.println("No, both students are not same."+" stud1 "+ stud1 + " stud2 " + stud2);
		}
		
	}

}

class Student{
	
	private int rollNumber;
	private String name;
	private Address address;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student studObj = (Student) obj;
			if(this.rollNumber == studObj.getRollNumber() &&
			   this.name.equals(studObj.getName()) && 
			   this.address.equals(studObj.getAddress())){
				return true;
			}
				
			
		}
		return false;
	}
	
	public String toString(){
		return "Name: "+name +" RollNumber: "+ rollNumber + " Address: " + address;
	}
	
}

class Address{
	
	private int suit_no;
	private String street;
	private String city;
	private int pinCode;
	public int getSuit_no() {
		return suit_no;
	}
	public void setSuit_no(int suit_no) {
		this.suit_no = suit_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	} 
	
	public boolean equals(Object obj){
		  if(obj instanceof Address){
			  Address addObj = (Address)obj;
			  if(this.suit_no == addObj.getSuit_no() &&
			     this.street.equals(addObj.getStreet()) &&
			     this.city.equals(addObj.getCity()) &&
			     this.pinCode == addObj.getPinCode()) {
				 return true; 
			  }
				  
		  }
		
		return false;
	}

	public String toString() {
		return "Suit NO: "+getSuit_no() +" Street: "+street +" City: "+city+" PinCode: "+pinCode;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}