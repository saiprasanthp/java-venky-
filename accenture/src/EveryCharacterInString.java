//to print characters in java single
public class EveryCharacterInString {

	public static void main(String[] args) {
		String s="welcome this is java class";
		int index=0;
		for(int i=0;i<s.length();i++) {
			index=i;
			System.out.println(index+"="+s.charAt(i));  	
		}
    
	}

}
