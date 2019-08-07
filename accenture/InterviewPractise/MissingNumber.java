//missing number finding
public class MissingNumber {

	public static void main(String[] args) {
		int[] j= {10,2,4,6,5,3,7,9,8};
		int n=10;
		int total=0;
		int sum=(n*(n+1))/2;
		for(int i=0;i<j.length;i++) {
			total=total+j[i];
		}
		int missing=sum-total;
		System.out.println(missing); 
		

	}

}
