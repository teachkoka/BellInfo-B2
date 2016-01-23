package com.bellinfo.practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

class A {}
public class B implements Serializable  {
	A a = new A();
	public static void main(String... args){
		B b = new B();
		try{
			FileOutputStream fs = new FileOutputStream("b.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(b);
			os.close();
			}catch(Exception e){
			e.printStackTrace();
		}
	}
}

