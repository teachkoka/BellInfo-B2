package com.bellinfo.batch2.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\BellInfo\\batch1\\Website.ser");
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    WebSite webSite = (WebSite)ois.readObject();
		    System.out.println(webSite);
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
