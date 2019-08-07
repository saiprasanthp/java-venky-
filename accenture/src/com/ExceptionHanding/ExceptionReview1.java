package com.ExceptionHanding;

public class ExceptionReview1 {
	public void m1() {
//	try {
		getDetails();
	//	System.out.println("main");
		//}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("hai1");
		}
	//}
	public  void  getDetails() {
		try {
		getMoreDetails();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("getDetails METHOD");
	}
	public  void getMoreDetails()
 {
		System.out.println(100/0);
		System.out.println("getmoredetails");//unreachablecode
	}


	public static void main(String[] args) {
		ExceptionReview1 k=new ExceptionReview1();
		try {
		k.m1();
		System.out.println("hai");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
