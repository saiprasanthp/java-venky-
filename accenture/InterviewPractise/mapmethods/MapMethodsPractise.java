package mapmethods;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethodsPractise {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		int[] h= {101,201,202,303,404,505,605};
		for(int i=0;i<h.length;i++) {
			for(int j=i+1;j<h.length;j++) {
				map.put(h[i], h[j]);
			}
		}
		Collection<Integer> k=map.values();
		Iterator<Integer> al=k.iterator();
		while(al.hasNext()) {
			Integer k1=al.next();
			//Map .Entry<Integer, Integer> mm=(Map.Entry<Integer, Integer>)al.next();
			
		}
	}
} 