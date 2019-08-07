package co.array.practise.online;

public class SinglrDimensionArray {

	public static void main(String[] args) {
		int[] h=new int[] {1,2,3};
		int[] j=new int[3];
		int[] single= {1,2,3};
		for(int i=0;i<single.length;i++) {
			j[i]=single[i];
			System.out.println(j[i]);
		}
		int max=h[0];
		for(int i=1;i<h.length;i++) {
		if(h[i]>max) {
			max=h[i];
		}
		
		}System.out.println("maximium value"+max);
		

	}

}
