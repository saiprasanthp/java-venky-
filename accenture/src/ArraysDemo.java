
public class ArraysDemo {

	public static void main(String[] args) {
		/*int[] a= {12,34,56,89};
		for(int b:a) {
			System.out.println(b);}*/
			
			/*int[][] a=new int[2][3];
			a[0][0]=10;
			a[0][1]=20;
			a[0][2]=30;
			a[1][0]=40;
			a[1][1]=50;
			a[1][2]=60;
			for(int[] c:a) {
				for(int b:c) {
					System.out.println(b);
				}
			}*/
			
		int[] a= {12,34,56,89};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
				
			}
		}System.out.println(max);
		System.out.println(min);



	}

}
