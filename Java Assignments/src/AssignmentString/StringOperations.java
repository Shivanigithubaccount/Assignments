package AssignmentString;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());
		
		System.out.println(str.replace("a", "$"));
		
		System.out.println(str.contains("collection"));
		
		System.out.println(str.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));

	}

}
