package TwoDimensionalArrays;

public class TwoDimensionalArrays {
	
	
	public static int[][]  multiDimensional(int[][] l) {
		l[0][0]=1;
		l[0][1]=1;
		//l[0][2]=1;
		l[1][0]=1;
		l[1][1]=1;
		//l[1][2]=1;
		l[2][0]=1;
		l[2][1]=1;
		//l[2][2]=1;

 
		return l;
		
	}
	
	public static void m1(int[] m) {
		System.out.println(m.length);
		
		for(int i=0;i<m.length;i++) {
			
			
			m[i]=i;
			System.out.println(i);
		}
		
	}
	

	public static void main(String[] args) {
		
		
		int[][] k=new int[3][2];
		int[][] m=TwoDimensionalArrays.multiDimensional(k);
		
		for(int[] l:m) {
			for(int a:l) {
				//System.out.println(a);
			}
		}
		
		
		for(int i=0;i<m.length;i++) {
			
			for(int j=0;j<m.length-1;j++) {
				
				System.out.println(m[i][j]);
			}
		}
		
		int[] l=new int[10];
		m1(l);
		
	}

}
