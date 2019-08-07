//print byte values
public class PrintByteValues {

	public static void main(String[] args) {
		String s="hai";
		byte[] r=s.getBytes();
		for(byte f:r) {
			System.out.println((char)f);
		}
		

	}

}
