package com.getters.setters;

public class GettersSetters1 {
	public String username;
	public String password;
	public void setUsername(String user) {
		this.username=user;

	}
	public String getUsername() {
		return username;

	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public static void main(String[] args) {
		GettersSetters1 h=new GettersSetters1();
		h.setPassword("sai");
		System.out.println(h.getPassword());
		h.setUsername("jai");
		System.out.println(h.getUsername());
	}

}
