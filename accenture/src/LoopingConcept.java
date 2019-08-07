//looping concept example
public class LoopingConcept {
	public static void main(String[] args) {
		int i=121;
		System.out.println(i++);//first print the value of i=0 and the increment by1
		System.out.println(i-- + ++i);//then i=1;print as 1 and then decrement by -1
		System.out.println(++i);//then i becomes 0 and added i+1;print as 1
		System.out.println(--i);//then i becomes 1 then i decreases to -1 and becomes to 0
		int d=120;
		//System.out.println(d++ + --d);
		System.out.println(d++ + ++d);
		/*do {
			System.out.println(i);
			i++;
		}while(i<=10);
	*/
		/*int a=10;
		do {
			a++;
			System.out.println("a");
		}
		while(a>10) ;*/
		int c=2;
		System.out.println(c-- + --c + c++);
		aa:
		for(int x=0;x<=5;x++) {
			bb:
				for(int z=0;z<=5;z++) {
					if(x==2||z==2) {
						break aa;
					}
					System.out.println(z);
					
				}
		System.out.println(x);
		}

	}

}
