/* Write a Java program to concatenate a given string to the end of another string. Go to the editor

Sample Output:

String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises*/
public class String_Net4 {

	public static void main(String[] args) {
		String s="PHP Exercises and";
		String s2=" Python Exercises";
		String s3=s.concat(s2);
		System.out.println(s3);

	}

}
