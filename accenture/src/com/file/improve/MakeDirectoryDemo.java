package com.file.improve;

import java.io.File;

public class MakeDirectoryDemo {

	public static void main(String[] args) {
		try {
		File d=new File("F:\\","subbu");
		boolean f=d.mkdir();
		if(!f) {
			System.out.println("directory is present");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		boolean g=true;
		if(!g) {
			System.out.println("true");
		}else {
			System.out.println("m");
		}

	}

}
