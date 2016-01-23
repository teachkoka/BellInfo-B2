package com.bellinfo.batch2.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSiteExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	//	System.out.println("how many:");
		//String size =scan.nextLine();
		
		//int count = Integer.parseInt(size);
		ArrayList<Site> alList = new ArrayList<>(3);
		int x = alList.size();
		
	System.out.println(x);
		for(int i=0;i<=alList.size();i++){
			Site s = new Site();
			System.out.println("Enter Name:");
			s.setName(scan.nextLine());
			System.out.println("Enter purpose:");
			s.setPurpose(scan.nextLine());
			System.out.println("Enter Value:");
			s.setSiteValue(scan.nextDouble());
			alList.add(s);
		}
		
		for(Site site:alList){
			System.out.println(site);
		}
		
		ArrayList<Site> al = new ArrayList();
		Site s1 = new Site();
		s1.setName("Google");
		s1.setPurpose("Search Engine");
		s1.setSiteValue(1000.00);
		
		Site s2 = new Site();
		s2.setName("FaceBook");
		s2.setPurpose("Social Network");
		s2.setSiteValue(1000.00);
		
		Site s3 = new Site();
		s3.setName("FaceBook");
		s3.setPurpose("Social Network");
		s3.setSiteValue(1000.00);
		
		if(!al.contains(s1)){
			al.add(s1);
		}
		if(!al.contains(s2)){
			al.add(s2);
		}
		if(!al.contains(s3)){
			al.add(s3);
		}
		
		for(Site s:al){
			System.out.println(s);
		}
		
	}

}

class Site {
	private String name;
	private double siteValue;
	private String purpose;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSiteValue() {
		return siteValue;
	}
	public void setSiteValue(double siteValue) {
		this.siteValue = siteValue;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String toString(){
		return " Name "+ name + " SiteValue "+siteValue +" Purpose "+purpose;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Site){
			Site s = (Site)obj;
			if(this.getName().equals(s.getName()) &&
				this.getPurpose().equals(s.getPurpose()) &&
				this.getSiteValue() == s.getSiteValue()){
				return true;
			}
		}
		return false;
	}
	
	
}