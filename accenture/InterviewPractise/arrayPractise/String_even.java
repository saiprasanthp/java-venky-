package arrayPractise;

public class String_even {

	public static void main(String[] args) {
		String s="who is the founder of whatsapp";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				Character c=s.charAt(i);
				String m=c.toString().toUpperCase();
				System.out.print(m);
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
}