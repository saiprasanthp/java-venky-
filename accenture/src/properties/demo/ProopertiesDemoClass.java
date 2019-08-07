package properties.demo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ProopertiesDemoClass {

	public static void main(String[] args) throws Exception{
		Properties t=new Properties();
		InputStream in=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\accenture\\file.properties");
		t.load(in);
		System.out.println(t.getProperty("url"));
		System.out.println(t.getProperty("tez"));
		System.out.println(t.getProperty("hai"));
	}

}
