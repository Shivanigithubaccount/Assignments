package AssignmentExceptionHandling;

import java.util.Scanner;

public class Exception_Handling_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Dividend");
		a = sc.nextInt();
		System.out.println("Enter Divisor");
		b = sc.nextInt();
		
		try {
			System.out.println("Ans :" +(a/b));
		}catch(ArithmeticException ae) {
			System.out.println("Error :" +ae.getMessage());
		}
		

	}

}
