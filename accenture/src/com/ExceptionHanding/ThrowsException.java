package com.ExceptionHanding;

import java.io.IOException;

public class ThrowsException  {
	public void n() throws Exception {
		throw new IOException();
	}
	public void m() throws Exception{
		this.n();
	}

	public static void main(String[] args) {
		ThrowsException h=new ThrowsException();
		try {
		h.m();
		}catch(Exception e) {
			System.out.println("hello this is catchblockException");
		}
		System.out.println("normal termination");
		

	}

}
