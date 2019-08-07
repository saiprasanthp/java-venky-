package co.array.practise.online;
//largest number in an array
public class Largest_Number_in_Array {

	public static void main(String[] args) {
		int[] j= {10,20,30};
		int max=j[0];
		for(int i=1;i<j.length;i++) {
			if(j[i]>max) {
				max=j[i];
			 }	
		}
		System.out.println(max);
		String name="123";
		int i=Integer.parseInt(name);
		System.out.println(i);
		

	}

}
