package co.array.practise.online;

public class MultiDimensionArray2 {

	public static void main(String[] args) {
		int[][] f= {{1,2,3},{3,4,4}};
		int[][] s= {{4,5,6},{5,6,7}};
		int[][] h=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				h[i][j]=f[i][j]+s[i][j];
			}
		}for(int[] j:h) {
			for(int l:j) {
				System.out.print(l+" ");
			}
			System.out.println();
			
		}
		

	}

}
