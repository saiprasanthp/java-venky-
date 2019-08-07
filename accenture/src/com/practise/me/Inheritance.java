package com.practise.me;

import java.util.Scanner;

class Inherit
{
	public void m1(int i)
	{
		System.out.println("hello");
	}

}
public class Inheritance extends Inherit
{
	public void m1(int k)
	{
		System.out.println("hai");

	}

	public String[] array()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter pswd");
		String psd=sc.next();
		String[] j=new String[2];
		j[0]=name;
		j[1]=psd;
		sc.close();
		return j;	
	}

	public boolean myData(String[] user)
	{
		if(user[0].equals("sai")&&(user[1].equals("123")))
		{
			return true;
		}
		return false;

	}

}



