package collectionsScenario;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ScenarioCollections extends MapDemo {
	static Scanner sc;
	public void user_details(Map<String,String> kk) {
		 sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String pwd=sc.next();
		Set<String> keys=kk.keySet();
		if(keys.contains(username)) {
			String obj=kk.get(username);
			if(obj.equals(pwd)) {
				System.out.println("u can log in");
			}else {
				System.out.println("incorrrect gmail or password");
			}
		}else {
				this.m2(kk);
			}
		}
	
	public void m2(Map<String,String> ll) {
		System.out.println("enter create profile");
		System.out.println("enter gmail");
		String gmail=sc.next();
		System.out.println("enter password");
		String pwd=sc.next();
		ll.put(gmail, pwd);
		System.out.println(ll);
		System.out.println("profile updated pls login again");	
	}
}
