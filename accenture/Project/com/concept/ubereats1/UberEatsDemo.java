package com.concept.ubereats1;
import com.venky.ubereats.*;

public class UberEatsDemo  {

	public static void main(String[] args) {
		CodeFinal h=new CodeFinal();
		h.setPromocode("EPICEATS");
		h.setBiryani("dumbiryani");
		try {
		h.validate();
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
