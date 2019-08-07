import java.util.Scanner;
public class Variables {
	private long acc_no;
	public long get_Acc() {
		return acc_no;
		
	}
	public void set_Acc(long acc_no) {
		this.acc_no=acc_no;
		
		
		
		
	}
	
	 

	public static void main(String[] args) {
		Variables d=new Variables();
		d.set_Acc(12233344);
		System.out.println(d.acc_no);
		
		

	}

}
