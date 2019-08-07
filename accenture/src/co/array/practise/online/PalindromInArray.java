package co.array.practise.online;

public class PalindromInArray {
	/*public static int[] m1() {
		int[] b= {121,12,13,454,11};
		for(int j:b) {
		}
		return b;	
	}
	public static int[] m2(int[] j) {
		int rem;
		int temp=0;
		int[] temp1 =new int[6];
		for(int i=0;i<j.length;i++) {
			while(j[i]>0) {
				rem=j[i]%10;
				temp1[i]=(temp*10)+rem;
				j[i]=j[i]/10;
			
			System.out.println(temp1[i]);
			}
		} return temp1;
		for(int i=0;i<j.length;i++) {
		if(j[i]==temp1[i]) {
			System.out.println("hi");
			System.out.println(temp1[i]+"palindrom");
		}*/
		//}	
	public static void m3(int[] m,int[] h) {
		for(int i=0;i<h.length;i++) {
			if(h[i]==m[i]) {
				System.out.println("hai");
			}else {
				System.out.println("l");
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		/*int[] g=m1();
		int[] d=m2(g);
		 m3(d,g);*/
		 int[] b= {121,12,13,454,11};
		 System.out.println(b.length);
		 for(int i=0;i<b.length;i++) {
			 for(int j=b.length;j>0;j--) {
				 
				 if(b[j-1]==b[i]) {
					 System.out.println(b[j-1]+"is palindrom");
				 }
			 }
			 
		 }
		 
		 
		
				
			 
		 }
		 
		 
		 
		
		}
		

		
	


