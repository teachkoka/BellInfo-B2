import java.util.Scanner;


public class ReverseNumber {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int i=0, result=0;
		while(input!=0){
			result = result *10;
			result = input%10+result;
			input = input/10;
			
		}
		System.out.println("reversed number:" + result);
	}

}
