package AssignmentExceptionHandling;

import java.util.Scanner;

public class Exception_Handling_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dividend");
		a = sc.nextInt();
		System.out.println("Enter Divisor");
		b = sc.nextInt();
		
		try {
			name(a,b);
			
		}catch(UnsupportedOperationException uoe) {
			System.out.println("Error: "+ uoe.getMessage());
			
			if (uoe.getCause()!=null) {
				System.out.println("Cause by :" +uoe.getCause());
		}

	}


	}
	
	public static void name(int a, int b) throws UnsupportedOperationException {
		
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			throw new UnsupportedOperationException("Exception:", e);
		}
	}

}
