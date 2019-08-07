package com.Inhetitance.test;
class Mi{
	public void m3() {
		System.out.println("hai");
	}
	
}
class Gross{
	public void m1(Is k) {
		System.out.println(k.name);
		
	}
	public void m4(int m,Is k) {
		System.out.println(m);
		
		
	}
}
class Is{
	String name="sai";
	Gross j;
	Is(Gross j){
		this.j=j;
		j.m1(this);
		this.m2(this,j);
		Mi b=new Mi();
		b.m3();
	}
	
	public void m2(Is j,Gross k) {
		int k1=20;
		k.m4(k1,this);
		System.out.println(j.name);
	}

	
	
}

public class Is_ARelation {

	public static void main(String[] args) {
		Gross g=new Gross();
		Is j=new Is(g);
	}

}
