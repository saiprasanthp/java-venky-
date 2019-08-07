 /*Write a Java program to get the character (Unicode code point) at the given index within the String. Go to the editor

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 51                                                                                 
Character(unicode point) = 101*/ 
public class String_Net1 {

	public static void main(String[] args) {
		String s="w3resource.com";
		byte[] b=s.getBytes();
		for(byte h:b) {
			System.out.println(h);
		}
		

	}

}
