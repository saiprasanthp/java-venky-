/*. Write a java program to compare two strings lexicographically. Go to the editor

Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2" */
public class String_Net2 {

	public static void main(String[] args) {
		String s1="This is Exercise 1";
		String s2="This is Exercise 2";
		int result=s1.compareTo(s2);
		System.out.println(result);
		if(result>1) {
			System.out.println("This is Exercise 1>This is Exercise 2");
		}else if(result==0){
			System.out.println("This is Exercise 1=This is Exercise 2");
		}else {
			System.out.println("This is Exercise 1<This is Exercise 2");
		}

	}

}
