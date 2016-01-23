import java.util.Scanner;
/*A prime number (or a prime) is a natural number greater than 1 that 
 * has no positive divisors other than 1 and itself.
 *  A natural number greater than 1 that is not a prime number is called a composite number*/

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
	    if(input==2){
	    	System.out.println("2 is prime number");
	    }
		boolean isPrime = true;
		for(int i=2;i<input; i++){
			if(input%i ==0){
				isPrime = false;
			    break;
			}
			
		}
		if(isPrime){
			System.out.println(input+" is prime ");
		} else {
			
			System.out.println(input+ " is not prime");
		}
		

	}

}
