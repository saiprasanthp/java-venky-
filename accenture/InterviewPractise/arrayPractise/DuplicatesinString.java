package arrayPractise;

import java.util.HashSet;

public class DuplicatesinString {

	public static void main(String[] args) {
		String s="saiwhatdoingare";
		int counter=0;
		HashSet h=null;
		char[] car=s.toCharArray();
		for(int i=0;i<car.length;i++) {
			for(int j=i+1;j<car.length;j++) {
				if(car[i]==car[j]) {
					//System.out.println(car[j]);
					h=new HashSet();
					h.add(car[j]);
					//System.out.println(h);
					
					
				}
			}
			
		}
		System.out.println(h);
		HashSet j=new HashSet();
		j.add("1");
		j.add("1");
		System.out.println(j);
		System.out.println(0/100);
		//System.out.println(100/0);

	}

}
