package test;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num = scan.nextInt();
		
		for(i = 2; i <= num; i++) {
			if(num % i == 0) {
				count ++;
				break;
			}
		}
		
		if(count == 0) {
			System.out.println("This is a Prime Number");
		}else {
			System.out.println("This is not a prime number");
		}
		

	}

}
