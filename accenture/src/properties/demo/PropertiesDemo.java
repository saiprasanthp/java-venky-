package properties.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties property=new Properties();
		try {
			InputStream input=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\accenture\\src\\properties\\demo\\demo1.properties");
			property.load(input);
			String name=property.getProperty("username");
			String pwd=property.getProperty("pwd");
			m1(name,pwd);
			write();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void m1(String name,String pwd) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter pwd");
		String psd=sc.next();
		if(username.equals(name)&&psd.equals(pwd)) {
			System.out.println("login");
		}else {
			System.out.println("enter details again ");
		}sc.close();
	}
	public static void write() {
		Properties property=new Properties();
		try {
			OutputStream input=new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\accenture\\src\\properties\\demo\\demo.properties");
			property.setProperty("url", "htpp");
			property.store(input, null);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
