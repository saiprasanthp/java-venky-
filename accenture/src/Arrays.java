
public class Arrays {

	public static void main(String[] args) {
		int[] a= {101,28,39,400};
		int avg=average(a);
		System.out.println(avg);
		
		int[] b = printascSorting(a);
		
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}

	private static int[] printascSorting(int[] c) {
		for(int i=0;i<c.length;i++)
		{ }
		return null;
	}

	private static int average(int[] b) {
		int avg, sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum = sum + b[i];
		}
		avg = sum/b.length;
		return avg;
	}
}
