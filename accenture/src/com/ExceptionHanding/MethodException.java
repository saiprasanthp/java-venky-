package com.ExceptionHanding;
class Exc extends RuntimeException{
	
}

public class MethodException {
	public void validate() throws Exception {
		
		System.out.println(100/0);
		throw new Exception();
	}

	public static void main(String[] args) throws Exc {
		MethodException h=new MethodException();
		try {
		h.validate();
		}catch(Exception e) {
			System.out.println("hai");
		}

	}

}
