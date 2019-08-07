package com.ExceptionHanding;
class Custom extends RuntimeException{
	
}

public class CustomizedException extends Custom{
	public static void validate(int i) {
		try {
		System.out.println(100/0);
		}catch(Exception e) {
		throw new CustomizedException();
		}
		
	}

	public static void main(String[] args) throws CustomizedException {
		validate(10);
		throw new Custom();
		

	}

}
