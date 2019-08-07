//average in array example
public class AverageInArray {

	public static void main(String[] args) {
		double[] x= {1,2,3,4};
		double total=0;
		for(int i=0;i<x.length;i++) {
			total +=x[i];
	
		}
		double average=total/x.length;
		System.out.println("average of the array:"+average);
		

		/*int a=10;
		int b=20;
		int average=(a+b)/2;
		System.out.println(average);*/
	}

}
