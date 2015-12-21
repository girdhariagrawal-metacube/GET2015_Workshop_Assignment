/**
 * 
 * @author Girdhari
 * description : Implementation of charAt function
 */

public class CharAt {

	public static void main(String[] args) {
		String str = "This is a sample String";
		
		System.out.println(str.charAt(5));
		
		System.out.println(charAt(str, 5));
	}
	
	public static char charAt(String str, int pos) {
		
		char charArray[] = str.toCharArray();
		return charArray[pos];
	}
}
