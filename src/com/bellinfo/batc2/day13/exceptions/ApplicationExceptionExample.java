package com.bellinfo.batc2.day13.exceptions;

import java.util.Date;
import java.util.Scanner;

public class ApplicationExceptionExample {

	public static void main(String[] args) {
		System.out.println("Please enter CCNumber :");
		Scanner scan = new Scanner(System.in);
		String userCardNumber = scan.nextLine();
		try{
		validateCreditCardNumber(userCardNumber);
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
	}
	
	private static void validateCreditCardNumber(String cardNumber) throws CreditCardInvalidException{
		
		if (cardNumber.length() == 16) {
			System.out
					.println("Your card is accepted. Your product will delivered on "
							+ new Date());
		} else {
			throw new CreditCardInvalidException(cardNumber);
		}
	}
}

class CreditCardInvalidException extends RuntimeException{
	String cardNumber;
	public static final int cardNumberSize = 16;
	
	CreditCardInvalidException(){
		System.out.println("Invalid Credit Card Number");
	}
	
	CreditCardInvalidException(String ccNumber){
		super();
		cardNumber = ccNumber;
		System.out.println("Invalid Credit Card Number "+cardNumber);
	}
	
	public String toString(){
		return "please try again with card number size is "+cardNumberSize;
	}
}









