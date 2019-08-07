package arrayPractise;

public class Excepton {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}catch(ArithmeticException e) {
			System.out.println("hai");
		}catch(Exception e) {
			System.out.println("hrr");
		}
		}
	}