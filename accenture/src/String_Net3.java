/*6. Write a java program to compare two strings lexicographically, ignoring case differences. Go to the editor

Sample Output:

String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1  */                                                                                
/*"This is exercise 1" is equal to "This is Exercise 1"*/
public class String_Net3 {

	public static void main(String[] args) {
		String s1="This is exercise 1";
		String s2="This is Exercise 1";
		int result=s1.compareToIgnoreCase(s2);
		if(result>1) {
			System.out.println("This is Exercise 1>This is Exercise 2");
		}else if(result==0){
			System.out.println("This is Exercise 1 is equal to This is Exercise 2");
		}else {
			System.out.println("This is Exercise 1<This is Exercise 2");
		}

	}

}
