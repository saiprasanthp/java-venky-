import java.util.Scanner;

//String and method example
public class MyOwnExample {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	static {
		System.out.println("welcome to online food delivery");
		System.out.println("HAPPY TO SERVE YOU");	
	}
	boolean validate(String name,String password) {
		if(name.equals(name)&&password.equals(password)) {
			System.out.println("enter to the login page ");
			System.out.println("make a move to order");
			return true;
		}return false;
	}
	public static void main(String[] args) {
		MyOwnExample d=new MyOwnExample();
		Scanner f=new Scanner(System.in);
		System.out.println("enter name");
		String name=f.next();
		d.setName(name);
		System.out.println("hi"+" "+ d.getName()+" "+"lets get started");
		System.out.println("enter password");
		String password=f.next();
		d.setPassword(password);
		//System.out.println("your password is safe");
		boolean g=d.validate(name,password);
		if(g==true) {
			System.out.println("select the item");
		}else {
			System.out.println("please invalid user name");
		}f.close();
	}
}
