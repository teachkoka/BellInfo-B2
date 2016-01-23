package com.bellinfo.batch2.day5;

public class EqualsExample {

	
	public static void main(String[] args) {

		Student[] studentArray = new Student[3];
		
		Address add = new Address();
		add.setSuit_no(121);
		add.setStreet("Astoria Cir");
		add.setCity("Herndon");
		add.setPinCode(20170);
		
		Address add1 = new Address();
		add1.setSuit_no(121);
		add1.setStreet("Astoria Ci");
		add1.setCity("Herndon");
		add1.setPinCode(20170);
		
		
				
		Student std2 = new Student(13, "Siva", add);
		Student std3 = new Student(13, "Siva",add1);
		
		studentArray[0] = std2;
		studentArray[1] = std2;
		
		
		if (std2.equals(std3)) {
			System.out.println("Content is Same");
		} else {
			System.out.println("Content is not same");
		}
	}
}
class Student {

	int rollNumber;
	String name;
	Address address;
	double fee;
	

	Student(int roll, String name) {
		rollNumber = roll;
		this.name = name;
	}

	Student(int roll, String name, Address address) {
		rollNumber = roll;
		this.name = name;
		this.address = address;
	}

	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student compStudent = (Student) obj;
			int compRollnumber = compStudent.rollNumber;
			String compName = compStudent.name;
			Address address = compStudent.address;
			if (this.rollNumber == compRollnumber && this.name.equals(compName) && this.address.equals(address)) {
				return true;
			}
		}

		return false;
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
			Address add =(Address)obj;
			if(this.getSuit_no() == add.getSuit_no() && this.getStreet().equals(add.getStreet()) &&
					this.getCity().equals(add.getCity()) && this.getPinCode() == add.getPinCode()){
				return true;
			}
		}
		return false;
	}
	
}
