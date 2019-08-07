package com.strings.interviewPrograms;

public class SumOfDigitsinString {

	public static void main(String[] args) {
		String m="sai1234";
		int sum=0;
		char[] k=m.toCharArray();
		for(int i=0;i<k.length;i++) {
			char kk=k[i];
			Character cc=new Character(kk);
			if(cc.isDigit(kk)) {
				Integer l=new Integer(kk);
				sum=sum+l;
			}
		}
		System.out.println(sum);
		Integer j=new Integer(10);
		int i=10;
		String num=Integer.toString(i);
		String s="10";
		int n=Integer.parseInt(s);
	}
}