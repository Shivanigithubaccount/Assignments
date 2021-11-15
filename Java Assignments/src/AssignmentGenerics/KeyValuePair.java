package AssignmentGenerics;

public class KeyValuePair <k,v> {
	private k key;
	private v value;
	
	public Pair(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public <k,v> String showData() {
		return key+ " " +value; 
	}
}
public class Pair  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyValuePair<String, String> obj1 = new KeyValuePair<String, String>("1", "Hello");
		KeyValuePair<String, java.util.Date> obj2 = new KeyValuePair<>("Today is :", new java.util.Date());				
		
		System.out.println(obj1.showData());
		System.out.println(obj2.showData());

	}

}
