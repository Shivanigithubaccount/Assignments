package AssignmentOne;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userId = "Shivani";
		String password= "123456";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter User Name");
		String enteredUserId = sc.nextLine();
		
		System.out.println("Enter Password");
		String enteredPassword = sc.nextLine();
		
		if(userId.equals(enteredUserId)) {
			for(int i=0; i<3; i++) {
				
				if(password.equals(enteredPassword)) {
					System.out.println();
					System.out.println("Welcome" + userId);
					break;
				}
				else
				{
					if(i==2) {
						System.out.println();
						System.out.println("Sorry...Contact to admin.");
						break;
					}
				System.out.println("Wrong Password...Enter Again...");
				enteredPassword= sc.nextLine();
				}
			}
		}else {
			System.out.println("Wrong User Name Entered");
		}
		

	}

}
