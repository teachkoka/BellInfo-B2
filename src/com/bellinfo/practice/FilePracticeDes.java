package com.bellinfo.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class FilePracticeDes {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\BellInfo\\StdEx.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(ois.readObject().toString());
		System.out.println(ois.readObject().toString());
		
		
	}
	
	

}
