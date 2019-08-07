package com.map.demo;
import java.util.*;
class Methods{
	public void methodDemo() {
		TreeMap t=new TreeMap();
		t.put(101, "Ram1nlr1Ap1");
		t.put(102, "Ram1nlr1Ap1");
		t.put(103, "Ram1nlr1Ap1");
		t.put(104, "Ram1nlr1Ap1");
		Set s=t.descendingKeySet();
		System.out.println(s);//reverse
		SortedMap g=t.headMap(103);
		System.out.println(g);//{101=Ram1nlr1Ap1, 102=Ram1nlr1Ap1}
		SortedMap tail=t.tailMap(102);
		System.out.println(tail);//{102=Ram1nlr1Ap1, 103=Ram1nlr1Ap1, 104=Ram1nlr1Ap1}
		SortedMap h=t.subMap(102, 103);
		System.out.println(h);//{102=Ram1nlr1Ap1}
		SortedMap map=t.headMap(104, true);
		System.out.println(map);//{101=Ram1nlr1Ap1, 102=Ram1nlr1Ap1, 103=Ram1nlr1Ap1, 104=Ram1nlr1Ap1}
		SortedMap map1=t.tailMap(102, true);
		System.out.println(map1);//{102=Ram1nlr1Ap1, 103=Ram1nlr1Ap1, 104=Ram1nlr1Ap1}
		Object obj=t.firstKey();
		System.out.println(obj);//101
		Object obj1=t.lastKey();
		System.out.println(obj1);//104
	}
}

public class TreeMapDemoMethods {

	public static void main(String[] args) {
		Methods j=new Methods();
		j.methodDemo();


	}

}
