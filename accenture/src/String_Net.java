/* Write a Java program to get the character at the given index within the String. Go to the editor

Sample Output:

Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i */
public class String_Net {

	public static void main(String[] args) {
		int index;
		String s="Java Exercises!";
		for(int i=0;i<s.length();i++) {
			index=i;
			System.out.println(index+" "+s.charAt(i));
		}

	}

}
