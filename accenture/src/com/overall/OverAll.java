package com.overall;
class Stud{
	String name;
	int i;
	int j;
	static String college="gist";
	Stud(String name,int i){
		this.name=name;
		this.i=i;
	}
	public String toString() {
		if(j>0) {
			return name+" "+i+" "+j+" "+college;

		}else {
			return name+" "+i+" "+ "   "+college;
		}


	}
	public Stud(String name,int i,int j) {
		this.name=name;
		this.i=i;
		this.j=j;

	}
	public String toString1() {
		return name+" "+i+" "+college+" "+j;
	}

}

public class OverAll {

	public static void main(String[] args) {
		Stud h=new Stud("sai",101);
		System.out.println(h);
		Stud h1=new Stud("sai1",1011,1);
		System.out.println(h1);
	}

}
