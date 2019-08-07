package arrayPractise;

public class ArrayAscening {
	
	
	public static void main(String[] args) {
		
		int[] t= {90,30,10,20};
		int temp;
		for(int i=0;i<t.length;i++) {
			for(int j=i+1;j<t.length;j++) {
				
				
				if(t[i]>t[j]) {
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
		}
	for(int h:t) {
		System.out.println(h);
	}
		
	}

}
