//string capacity
public class StringCapacity {
	public static void main(String[] args) {
		StringBuffer d=new StringBuffer("sai");
		System.out.println(d.capacity());
		StringBuffer d1=new StringBuffer(100);
		System.out.println(d1.capacity());
		char[] ch= {'a','b','a','b','a','b','a','b','a','b','a','b','a','b','a','b'};
		String d2=new String(ch);
		String s3=d2.concat("hello");
		System.out.println(s3);
		StringBuffer d4=new StringBuffer("sai");
		d4.reverse();
		System.out.println(d4);		
		String d3=new String(ch);
		String s2=d3.substring(2, 4);
		System.out.println(s2);
		int[] x= {1,2,3,4,5};
		for(int a:x) {
			System.out.println(a);
			
		}
		int[][] c=new int[2][2];
		c[0][0]=10;
		c[0][1]=20;
		c[1][0]=30;
		c[1][1]=40;
		for(int[] j:c) {
			for(int n:j) {
				System.out.println(n);
			}
			
		}
		
		
	/*	for(int i=0;i<c.length;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.println(c[j]);
			}
			//System.out.println(c[i]);
			
			
		}*/










	}

}
