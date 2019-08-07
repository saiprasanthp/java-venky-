import java.util.ArrayList;

public class ReverseAnArray {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		int[] h= {10,12,3,4,6,7,9};
		for(int i=h.length;i>0;i--) {
			a.add(h[i-1]);
		}
		System.out.println(a);

	}

}
