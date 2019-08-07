package listPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> lis=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			lis.add(i);
		}
		System.out.println(lis);
		Iterator<Integer> all=lis.iterator();
		for(int i=0;i<lis.size();i++) {
			Integer mmm=lis.get(i);
			System.out.println(mmm);
		}

	}

}
