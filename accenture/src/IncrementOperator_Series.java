//incrementOperator 
public class IncrementOperator_Series {
	public static void main(String[] args) { 
		/*for(int i=1;i<5;i++) {               1
			for(int j=1;j<=i;j++) {            1 2
				System.out.print(j);           1 2 3
			}                                  1 2 3 4
			System.out.println();
		}
		*/
		/*for(int k=4;k>0;k--) {              // 1 2 3 4
			for(int g=1;g<=k;g++) {          //  1 2 3
				System.out.print(g+" ");    //   1 2
			}                              //    1
			System.out.println();
		}*/
		
		/*for(int l=1;l<=4;l++) {               //  4  3  2  1
			for(int h=4;h>=l;h--) {             //  4  3  2
				System.out.print(h+" ");        //  4  3 
			}                                  //   4
			System.out.println();
		}*/
		
		
		for(int i=8;i>=5;i--) {
			for(int k=5;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
