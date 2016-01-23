package com.bellinfo.practice;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileBasics {

	@SuppressWarnings("deprecation") public static void main(String[] args) {
		String filename="bellinfo.txt";
		String writingFile ="sivaFile.txt";
		
		String workingDirectory =System.getProperty("user.dir");
		String fullPath = workingDirectory+File.separator+filename;
		String fullPath1 = workingDirectory+File.separator+writingFile;
		File f = new File("C:\\Users\\kaizen\\workspace\\BellInfo-B2\\src\\com\\bellinfo\\practice\\filetest.txt");
		File f2 = new File(fullPath);
		File f3 = new File(fullPath1);
		FileInputStream fis=null;
		BufferedInputStream bis =null;
		DataInputStream dis= null;
		String writeText ="sasasa sasas \n ffdn done done";
		
		
		try {
			String text;
			BufferedReader br = new BufferedReader(new FileReader(fullPath));
			while((text=br.readLine())!=null){
				System.out.println(text);
			}
		} catch (FileNotFoundException e1) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(fullPath1);
			if(!f2.exists()){
				f2.createNewFile();
			} 
			
			byte[] b= writeText.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			
			
			while(dis.available()!=0){
				System.out.println(dis.readLine());
			}
			
			
			
			f.createNewFile();
			f.toPath();
			
			
			System.out.println(f.toPath());
			System.out.println(workingDirectory);
			System.out.println(fullPath);
            if(f2.createNewFile()){
            	System.out.println("created");
            }else{
            	System.out.println("already avaliable");
            }
            
            
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
