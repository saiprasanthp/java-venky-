package com.file.improve;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		FileOutputStream f=null;
		BufferedOutputStream g;
		try {
		 f=new FileOutputStream("F:\\travel.txt",true); 
		 g=new BufferedOutputStream(f);
		 
		 f.write(10);
		 String s="sai";
		 byte[] b=s.getBytes();
		 f.write(b);
		 String s1="jaji";
		 byte[] j=s1.getBytes(s1);
		 g.write(j);
		
		}catch(Exception e) {
			
		}finally {
			try {
				f.close();
				
			}catch(Exception e) {
				
			}
		}

	}

}
