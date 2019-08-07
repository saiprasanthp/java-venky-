package co.array.practise.online;

public class AdditionofMultiDimensionArray1 {

	public static void main(String[] args) {
		int[][] first= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] second= {{1,2,3},{4,5,6},{7,8,9}};
		int rows=3;
		int columns=3;
		int[][] sum=new int[rows][columns];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=first[i][j]*second[i][j];
			}
		}
		for(int[] g:sum) {
			for(int h:g) {
				System.out.print(h+" ");
			}
			System.out.println();
			
		}

	}

}
