
public class IfCondition111 {

	public static void main(String[] args) {
		
		
		int[][] g= {{10,20},{30,40},{50,60}};
		int[][] klm=new int[10][];
		System.out.println(g.length);
		for(int i=g.length-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				klm[i][j]=g[i][j];
			}
		}
		for(int[] k:klm) {
			for(int mm:k) {
				System.out.println(mm);
			}
		}
	}
}
