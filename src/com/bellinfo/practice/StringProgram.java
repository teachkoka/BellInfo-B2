package com.bellinfo.practice;

public class StringProgram {

	private final static String str ="This is a core javas";
	public static void main(String[] args) {
		identifyDuplicateCharacters();
	}
	
	private static void noOfWords(){
		int noOfWords = str.split(" ").length;
		
		String[] str1 = str.split(" ");
		int count = str1.length;
		System.out.println("Number Of words" + noOfWords);
	}
	
	private static void stringLength(){
		int length = str.length();
		System.out.println("length " +length);
		
	}
	
	private static void noOfSingleCharacterStrings(){
		String[] words = str.split(" ");
		int length = str.split(" ").length;
		int count = 0;
		for(int i=0;i<length-1;i++){
			if(1== words[i].length()){
				System.out.println(words[i]);
				count++;
				}
		}
		System.out.println("count :"+count);
		
	}
	
	private static void reverseEachWord(){
		String[] words = str.split(" ");
		int length = words.length;
		for(int i=0;i<length;i++){
			String singleWord = words[i];			
			int wordLenght = singleWord.length();
			for(int j=wordLenght-1; j>=0;j--){
				System.out.print(singleWord.charAt(j));
			}
			System.out.print(" ");
		}
				
	}
	
	
	private static void replaceWord(){
		
		System.out.println(str.replace("java", "SQL"));
		
	}
	private static void middleCharInString(){
		int length = str.length();
		int middle =length/2;
		System.out.println("str length"+length);
		System.out.println("middle"+middle);
		if(length%2 !=0){
			System.out.println(str.charAt(middle+1));
		}else {
			System.out.println(str.charAt(middle)+ ""+str.charAt(middle+1));
		}
		
		
	}
	
	
	private static void indexOfCharacter(char charValue){
		
		System.out.println("Index of "+charValue + " is "+str.indexOf(charValue)  );
		
	}
	private static void reverseString(){
		
		String[] strArray = str.split(" ");
		int noOfWords = strArray.length;
		for(int i=noOfWords-1;i>=0;i--){
			String word =strArray[i];
			for(int j=word.length()-1;j>=0;j--){
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	private static void identifyDuplicateCharacters(){
		//String innerString = str.replaceAll(" ", "");
		int count = str.length();
		char[] charArray = str.toCharArray();
		char[] charDuplicateArray = new char[20];
		int x =0;
		for(int i=0;i<count;i++){
			for(int j=0;j<count;j++){
				if(i!=j && charArray[i]!=' ' && charArray[i]==charArray[j]){
					charDuplicateArray[x]=charArray[i];
				}
			}
			x++;
		}
		System.out.println(String.copyValueOf(charDuplicateArray));
		
	}

}
