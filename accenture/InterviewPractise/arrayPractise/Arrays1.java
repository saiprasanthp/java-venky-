package arrayPractise;

public class Arrays1 {

	public static void main(String[] args) {
		
	int[] k= {10,1,4,60};
	int max=k[0];
	int min=k[0];
	for(int i=1;i<k.length;i++) {
		if(k[i]>max) {
			max=k[i];
		}
		else if(k[i]<min) {
			min=k[i];
		}
	}
	System.out.println(max);
	System.out.println(min);

	

}
}