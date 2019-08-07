
public class Retun {
	public int ak() {
		return 10;
	}
	public void ll(int l) {
		System.out.println(l);
		int p=21;
		int counter=0;

		for(int i=2;i<=p-1;i++) {
			if(p%i==0) {
				counter++;
				
			}
			
		}
		if(counter>0) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}
		
	}

	public static void main(String[] args) {
		Retun j=new Retun();
		int k=j.ak();
		j.ll(k);
		
		

	}

}
