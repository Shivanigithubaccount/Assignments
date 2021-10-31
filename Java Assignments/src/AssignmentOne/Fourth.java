package AssignmentOne;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=61, b=70, c=80;
		result(a,b,c);
	}
	public static void result(int a, int b, int c)
	{
		int passNo =0;
		if(a>60) {
			passNo++;
		}
		
		if(b>60) {
			passNo++;
		}
		
		if(c>60) {
			passNo++;
		}
		
		if(passNo<2) {
			System.err.println("Failed");
		}
		else if(passNo==2) {
			System.out.println("Promoted");
		}
		else if(passNo ==3) {
			System.out.println("Passed");
		}
	}

}
