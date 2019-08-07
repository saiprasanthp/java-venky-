package collectionsScenario;

import java.util.Map;

public class MainClassDemo {

	public static void main(String[] args) {
		MapDemo h=new MapDemo();
		Map<String,String> k=h.data();
		System.out.println(k);
		ScenarioCollections kk=new ScenarioCollections();
		kk.user_details(k);

	}

}
 