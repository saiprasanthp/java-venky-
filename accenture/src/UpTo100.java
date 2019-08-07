//even numbers upto 100
public class UpTo100 {

	public static void main(String[] args) {
              int n=100;
              int sum=0;
              for(int i=1;i<=n;i++) {
            	  if(i%2==0) {
            		  sum=sum+i;
            	  }

              }
    		  System.out.println("even numbers"+sum);

	}

}
