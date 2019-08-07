//linerSearch of an element in an array
/*Step 1: Traverse the array
Step 2: Match the key element with array element
Step 3: If key element is found, return the index position of the array element
Step 4: If key element is not found, return -1*/
public class LinerSearch {
	
	public static int m1() {
		int[] c= {10,20,30,40,50,60};
		int key=60;
		for(int i=0;i<c.length;i++) {
			if(c[i]==key) {
				return i;
			}
		}return -1;
	}

	public static void main(String[] args) {
		int i=m1();
		if(i==-1) {
			System.out.println("element not found");
		}
		System.out.println("index:"+i);
		

	}

}
