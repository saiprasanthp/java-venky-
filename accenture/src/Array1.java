
public class Array1 {

	public static void main(String[] args) {
		int[] a= {2,66,99,33,55,33,1};
		int min=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
		}
		
      System.out.println("the largest number is"+max);
      System.out.println("the smallest numbers is"+min);
	}

}
