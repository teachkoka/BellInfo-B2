package com.bellinfo.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FilePractice{

	public static void main(String[] args) {
		
		StudentEx stdEx = new StudentEx();
		stdEx.setId(1);
		stdEx.setName("Koka");
	
		StudentEx stdEx1 = new StudentEx();
		stdEx1.setId(2);
		stdEx1.setName("Siva");
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\BellInfo\\StdEx.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stdEx1);
			oos.writeObject(stdEx);
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}


class StudentEx implements Serializable{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "StudentEx [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentEx other = (StudentEx) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}