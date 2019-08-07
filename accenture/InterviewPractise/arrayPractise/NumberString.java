package arrayPractise;

public class NumberString {

	public static void main(String[] args) {
		
		String s="sai123";
		char[] j=s.toCharArray();
		for(int i=0;i<j.length;i++) {
			
			
			Character c=new Character(j[i]);
			if(c.isDigit(j[i])) {
				System.out.println(j[i]);
			}
		}

	}

}
