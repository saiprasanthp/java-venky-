//How to get distinct characters and their count in a String?
public class StringInterview1 {
	public static void main(String[] args) {
		int count=0;
		char n = 0;
		int c=0;
		String s=new String("today is java class");
		for(int i=0;i<s.length();i++) {
			
			n=s.charAt(i);
			count=i;
			System.out.println(n);
			System.out.println(count);
		}	
	}
}
