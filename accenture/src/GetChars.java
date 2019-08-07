
public class GetChars {

	public static void main(String[] args) {
		String s="this is my book";
		char[] d= new char[s.length()];      
		 s.getChars(1, 11, d, 0);
		 System.out.println(d);
		

	}



}
