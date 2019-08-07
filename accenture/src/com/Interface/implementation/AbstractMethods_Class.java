package com.Interface.implementation;
abstract class Bankers{
	abstract public int getIntrest();
}
class SBI extends Bankers{
	public int getIntrest() {
		return 7;
	}
	
}
class Andhra extends Bankers {
	public int getIntrest() {
		return 8;
	}
	
}

public class AbstractMethods_Class {

	public static void main(String[] args) {
		Andhra g=new Andhra();
		int intrestRate=g.getIntrest();
		SBI h=new SBI();
		int intrestRate1=h.getIntrest();
		System.out.println("AndhraBank intrestrate:"+intrestRate);
		System.out.println("sbiBank intrestrate:"+intrestRate1);


	}

}
