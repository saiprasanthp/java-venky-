import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringDuplicates {

	public static void main(String[] args) {
		String s="India is my country";
		Map<Character,Integer> hash=new HashMap<Character,Integer>();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(hash.containsKey(c[i])) {
				hash.put(c[i], hash.get(c[i])+1);
			}else {
				hash.put(c[i], 1);
			}
		}
		
		Set<Character> ch=hash.keySet();
		Iterator<Character> it=ch.iterator();
		while(it.hasNext()) {
			Character chr=it.next();
			Integer i=hash.get(chr);
			if(i>1) {
				System.out.println(chr+" "+i+" times");
			}
		}
	}
}
