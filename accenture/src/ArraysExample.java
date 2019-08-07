//greatest and smallest in an array
public class ArraysExample {
	public void arrayMethod(int[] c) {
		int max=c[0];
		int min=c[0];
		int index=0;
		int index1=0;

		for(int i=1;i<c.length;i++) {
			if(c[i]>max) {
				max=c[i];
				index=i;
			}else if(c[i]<min) {
				min=c[i];
				index1=i;
				
			}
		}System.out.println("the largest number"+max);
		System.out.println("the minimum value"+min);
		System.out.println("max:"+index);
		System.out.println("min:"+index1);
		
	}

	public static void main(String[] args) {
		int[] a= {22,65,89,90,45};
		ArraysExample t=new ArraysExample();
		 t.arrayMethod(a); 

	}

}
