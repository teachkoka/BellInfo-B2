package com.bellinfo.batch2.day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationsExample {

	public static void main(String[] args) {
		
		try(FileOutputStream fios= new FileOutputStream("C:\\BellInfo\\batch1\\Website.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fios); ) {
			 
		    WebSite ws = new WebSite();
		    ws.setName("Google");
		    ws.setCost(1000);
		    ws.setUri("google.com");
		    
		    oos.writeObject(ws);
		    oos.close();
		    fios.close();
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}


