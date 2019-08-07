package com.result1;

public class StudentDetails {
	public String name;
	public String date_bath;
	 public static String semi="sem"; 
	 public static String college="gist";

	public StudentDetails(String name, String date_bath) {
		this.name=name;
		this.date_bath=date_bath;	
	}
	public String toString() {
		return name+" "+date_bath+" "+semi+" "+college;
	}
}
