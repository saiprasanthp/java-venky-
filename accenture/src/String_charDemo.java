//string demo using char[]demo
public class String_charDemo {

	public static void main(String[] args) {
		String d="hello";
		char[] g=new char[10];
		try {
		d.getChars(0, 3, g, 0);
		System.out.println(g);
		}catch(Exception e) {
			e.printStackTrace();
		}
		String h="hsi";
		byte[] x=h.getBytes();
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		

	}

}
