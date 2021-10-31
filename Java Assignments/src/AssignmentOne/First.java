package AssignmentOne;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int originalNum = num;
		int total =0;
		
		while(num>0)
		{
			int no =(num%10);
			num =num/10;
			total = total+(no*no*no);
		}
		
		System.out.println(total==originalNum ? originalNum + " is a armstrong number": originalNum + "is not an armstrong number");

	}

}
