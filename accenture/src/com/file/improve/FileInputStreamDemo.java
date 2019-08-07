package com.file.improve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
class FileDemo12{
	public void fileDemo()  throws Exception{
		FileInputStream f=new FileInputStream("F:\\practise.txt");
		FileOutputStream h=new FileOutputStream("F:\\New Text Document (16).txt");
		int i=f.read();
		while(i!=-1) {
			h.write(i);
			System.out.print((char)i);
			i=f.read();
		}
		h.close();
		f.close();
	}
}
public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileDemo12 h=new FileDemo12();
		try {
		h.fileDemo();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
