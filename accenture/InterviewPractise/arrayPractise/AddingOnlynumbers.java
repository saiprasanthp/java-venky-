package arrayPractise;
//adding without duplicates to another array
import java.util.Arrays;

public class AddingOnlynumbers {

	public static void main(String[] args) {
		int[] a= {1,3,4,7,2,1,1,1};//1,1,1,1,2,3,4,7
		Arrays.sort(a);
		int[] b=new int[a.length];
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[k++]=a[i];
				
			}	
		}
		b[k]=a[a.length-1];
		for(int l:b) {
			if(l==0) {
				continue;
			}
			System.out.println(l);
		}


	}

}
