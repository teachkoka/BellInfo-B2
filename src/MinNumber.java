import java.util.Scanner;


public class MinNumber {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if(a<b && a<c && a<d){
			System.out.println("smallest number:" + a);
		} else if(b<c && b<d && b<a){
			System.out.println("smallest number:" + b);			
		} else if(c<d && c<b && c<a){
			System.out.println("smallest number:" + c);			
		} else if(d<c && d<a && d<b){
			System.out.println("smallest number:" + d);			
		} else {
			System.out.println("Please enter distinguish numbers");
		} 
		
	}

}
