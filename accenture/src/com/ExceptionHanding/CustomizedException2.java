package com.ExceptionHanding;
class InvalidAge extends RuntimeException{
	InvalidAge(){
		
	}	
	}

public class CustomizedException2 extends RuntimeException{
	
static CustomizedException2 f=new CustomizedException2();
	public static void main(String[] args)  {
		throw  new InvalidAge();
		

	}

}
