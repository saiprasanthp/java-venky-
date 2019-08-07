package co.array.practise.online;

public class AdditionofMultiDimensionArray {

	public static void main(String[] args) {
		int[][] first= {{1,2,3},{4,5,6}};
		int[][] second= {{7,8,9},{10,11,23}};
		int rows=2;  
		int columns=3;
		int[][] sum=new int[2][3];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sum[i][j]=first[i][j]+second[i][j];
			}
			
		}
		for(int[] row:sum) {
			for(int colum:row) {
				System.out.print(colum+" ");
			}
			System.out.println();
		}
	
		

	}

}
