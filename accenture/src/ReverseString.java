//ReversingString
public class ReverseString {
	public void reverse() {
		String s="string";
		char[] v=s.toCharArray();
		int k=v.length;
		for(int i=k;i>0;i--) {
			System.out.println(v[i-1]);
		}
	}
		public void anotherReverse() {
			String s="welcome";
			
			
			for(int i=s.length();i>0;i--) {
			
				int index=i-1;
				
				
				System.out.print(s.charAt(i-1));
				System.out.println(index);
			}	
		}
	public static void main(String[] args) {
		ReverseString sr=new ReverseString();
		sr.reverse();
		sr.anotherReverse();
	}
}
