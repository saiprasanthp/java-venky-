package co.array.practise.online;

public class MultiDimensionArray {

	public static void main(String[] args) {
		int rows=2;
		int columns=3;
		int[][] g= {{1,2,3},{4,5,6}};
		int[][] h=new int[2][3];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				h[i][j]=g[i][j];
				
			}
		}
		for(int[] m:h) {
			for(int v:m) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
		
			}
		

	}


