package arrayPractise;

import java.util.Arrays;

public class DuplicateArrays1 {

	public static void main(String[] args) {
		int[] a= {1,3,4,7,2,1,1,1};//1,1,1,1,2,3,7
		Arrays.sort(a);
		
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}else {
					break;
				}
				
			}
			System.out.println(a[i]+" "+count);
			i=i+count-1;
		}	

	}

}
