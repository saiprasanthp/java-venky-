import java.util.Scanner;
public class MissingNumber1 {
	static int[] valid() {
		Scanner f=new Scanner(System.in);
		System.out.println("enter number");
		int l=f.nextInt();
		int[] k=new int[101];
		for(int i=0;i<=100;i++) {
			if(i==l) { 
				continue;	
			}
			k[i]=i;
			System.out.println(k[i]);
		}f.close();
		return k;
	}
	static void validate(int[] h) {
		int n=100;
		int expected_sum=(n*(n+1))/2;
		int sum=0;
		for(int k:h) {
			sum=sum+k;
		}
		int missing_sum=expected_sum-sum;
		System.out.println("missing_value:"+missing_sum);
	}
	public static void main(String[] args) {
		int[] j=valid();
		validate(j);
	}

}
