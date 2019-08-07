//increment 
import java.util.Scanner;
class True{
	void  choose(String[] data) 
	{
		System.out.println("for hello choose 1");
		System.out.println("for hello choose 2");
		Scanner sc=new Scanner(System.in);
		switch(sc.nextInt())
		{
		case 1:
			System.out.println(data[0]);
			break;
		case 2:
			System.out.println(data[1]);
	}
}
}
public class Incremantation 
{
	static String[] g=new String[2];
	static String[] m1()
	{
		g[0]="hai";
		g[1]="hello";
		return g;	
	}
	public static void main(String[] args) {
		String[] data=m1();
		if(data[1].equals("hello"))
		{
			System.out.println("true");
			True f=new True();
			f.choose(data);
		}
		else
		{
			System.out.println("false");
		}
	}

}
