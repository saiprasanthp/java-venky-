//string reversing by using charAt method
public class StringPractise2 {

	public static void main(String[] args) {
		String s="my java class";
		/*for(int i=s.length();i>0;i--) {
			System.out.print(s.charAt(i-1));
		}*/
		
		int i=s.length();
		while(i>0) {
			System.out.print(s.charAt(i-1));
			i--;
		}
	}

}
