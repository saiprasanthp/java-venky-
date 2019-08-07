package co.array.practise.online;
//average of an array
public class ArrayAverage {

	public static void main(String[] args) {
		int a=0;
		int[] d= {10,20,30,40,50};
		for(int i=0;i<d.length;i++) {
			 a=a+d[i];	
		}
		System.out.println(a/d.length);

	}

}
