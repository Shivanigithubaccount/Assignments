package AssignmentGenerics;

public class ExchangePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = {100,200};
		
		System.out.println("Before Exchange of Position :"+ arr[0] + " " +arr[1]);
		
		System.out.println("After Exchange of Position: ");
		
		exchangeArrNum(arr);

	}
	
	public static <E> Void exchangeArrNum(E[] arr) {
		
		E temp = arr[1];
		arr[1] = arr[0];
		arr[0] = temp;
		
		System.out.println(arr[0]+ " " +arr[1]);
		return null;
	}

}
