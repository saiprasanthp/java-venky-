package com.ExceptionHanding;

public class ExceptionHandlingDemo  {
	public void loss() throws Exception {
		int[] i=new int[3];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		for(int g=i.length;g>0;g--) {
			System.out.println(i[g]);
		}	
	}
	public  void kiss() {
		System.out.println("kiss method is called");
	}

	public static void main(String[] args) {
		ExceptionHandlingDemo g=new ExceptionHandlingDemo();
		try {
		g.loss();
		}catch(Exception e) {
			System.out.println("ff");
			e.printStackTrace();
		}
		g.kiss(); 
		
	}

}
