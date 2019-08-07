
public class ArraysDevelop {
	static int g=90;
//	int g=10;
	public static void m1() {
		int g=20;
		System.out.println(g);
	}
	static {
		int g=100;
		System.out.println(g);
	}


	public static void main(String[] args) {
		int[][] g= {{10,20},{30,40},{50,60}};
		int[][] klm=new int[g.length][g.length-1];
		for(int i=0;i<g.length;i++) {
			for(int j=0;j<=g.length-2;j++) {
				klm[i][j]=g[i][j];
			}
		}
		for(int[] k:klm) {
			for(int mm:k) {
				System.out.println(mm);
			}
		}
		System.out.println(300+400+"sai"+90);
		
		
		int jee=10;
		
		if(jee==10) {
			jee=80;
			System.out.println(jee);
		}
	}
	static {
		int jee=49;
		System.out.println(jee);
	}
}
