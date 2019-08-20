
public class PrimeNumbers {

	public static void main(String[] args) {
		/*int k=9;
		int counter=0;
		for(int i=2;i<=k-1;i++) {
			
			
			if(k%i==0) {
				counter++;
			}	
		}
		if(counter==0) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime");
		}*/
		
		int counter = 0;
		for(int i=2;i<=100;i++) {
			 counter=0;

			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					
					counter++;
				}
			}
			if(counter==0) {
				System.out.println(i+"prime");
			}else {
				System.out.println(i+"not prime");
		}
		}

	}

}
