package AssignmentOne;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		int searchElement= 19;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==searchElement) {
				System.out.println(searchElement + "is present in the array");
			}else {
				System.out.println(searchElement + " is not present in the array");
			}
		}

	}

}
