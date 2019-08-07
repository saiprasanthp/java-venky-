package collectionsScenario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	static Map<String,String> m;
	
	public Map<String,String> data() {
		try {
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\user\\eclipse-workspace\\accenture\\InterviewPractise\\collectionsScenario\\gmail.txt"));
		m=new TreeMap<String,String>();
		String s=bf.readLine();
		while(s!=null) {
			String[] j=s.split("=");
			m.put(j[0], j[1]);
			s=bf.readLine();
		}
		bf.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	return m;
	}
}
 