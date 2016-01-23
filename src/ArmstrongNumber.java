import java.util.Scanner;
/*
An Armstrong number is the one that equals the sum of its digits raised to 
the power of the number of digits in that number which is to be checked
*/

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		String inputString = input+"";
		int numberOfDigits = inputString.length();
		int temp = input;
		int sum=0;
		while(temp!=0){	
			int a = temp%10;
			sum = sum +(int) Math.pow(a, numberOfDigits);
			temp = temp /10;
	
		}
		if(sum == input){
			System.out.println("Armstrong number:" + input);
		} else{
			System.out.println("Not Armstrong number");
		}
		

	}

}
