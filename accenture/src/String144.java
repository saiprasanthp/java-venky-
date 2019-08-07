import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class String144 {

	public static void main(java.lang.String[] args) {
		
		
		String s="saiias";
		for(int i=s.length();i>0;i--) {
			//System.out.println(s.charAt(i-1));
		}
		char[] k=s.toCharArray();
		HashMap map=new HashMap();
		int count=1;
		int m=0;
		for(int j=0;j<s.length();j++) {
			 m=count++;
		}
		Set h=new HashSet();
		//System.out.println(m);
		int counter=0;
		
		char[] l=s.toCharArray();
		for(int i=0;i<l.length;i++) {
			for(int j=l.length-1;j>0;j--) {
			if(l[i]==l[j]) {
				h.add(l[i]);
				System.out.println(l[i]);
				break;
			}
			}
			
		}
		System.out.println(h);
		
		
		
		Scanner sca=new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
