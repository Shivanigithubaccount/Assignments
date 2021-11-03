package AssignmentString;

public class StringBufferProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        StringBuffer sb = new StringBuffer();
		
		sb.append("String Buffer");
		sb.append("is a peer class of string");
		sb.append("That provides much of");
		sb.append("the functionality of the string");
		
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("It is used to _ at the specified index position");
		sb1.insert(sb1.indexOf("_")," ");
		System.out.println(sb1);
		sb1.replace(sb1.indexOf("_"),(sb1.indexOf("_")+1),"insert text");
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());


	}

}
