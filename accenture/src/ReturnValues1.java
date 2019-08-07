//returingvaluse
public class ReturnValues1 {
	int i=10;
	public boolean containt() {
		if(i==10) {
			return true;
		}return false;
	}
	public static void main(String[] args) {
		boolean flag;
		ReturnValues1 g=new ReturnValues1();
		flag=g.containt();
		if(flag) {
			System.out.println("hii");
		}else {
			System.out.println();
		}
		
		

	}

}
