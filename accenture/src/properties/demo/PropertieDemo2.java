package properties.demo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class PropertieDemo2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		Properties p=new Properties();
		try {
		InputStream in=new FileInputStream("C:\\Users\\user\\Documents\\New Text Document.txt");
		p.load(in);
		String user=p.getProperty("username");
		String pwd=p.getProperty("pwd");
		list.add(user);
		list.add(pwd);
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
