//missing number in an array
public class MissingNumber2 {

	public static void main(String[] args) {
		int[] d={1,2,3,4,5,6,8,9};
		int n=9;
		int intialsum=(n*(n+1))/2;
		int sum=calculateSum(d);
		int missingnumber=intialsum-sum;
		System.out.println(missingnumber);

	}

	private static int calculateSum(int[] d) {
		 int sum = 0;
	        for (int n : d) {
	            sum += n;
	        }
	        return sum;
	    }
	}


