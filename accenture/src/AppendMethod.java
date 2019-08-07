//append method
public class AppendMethod {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		StringBuffer s=sb.append("java");
		System.out.println(s);                  //StringBuffer the Object is changes
		System.out.println(sb);
		
		
		
		
		//insert method
		StringBuffer sb1=new StringBuffer("hello");
		sb1.insert(1, "java");
		System.out.println(sb1);       //op=hjavaello
		
		
		
		
		//replace method
		StringBuffer sb2=new StringBuffer("hello");
		sb2.replace(1, 3, "java");
		System.out.println(sb2);        //op=hjavalo
		
		
		//delete() method
		StringBuffer sb3=new StringBuffer("hello");
		sb3.delete(1,2);
		System.out.println(sb3);     //op=hllo
		
		
		//reverse method   it will reverse the string
		StringBuffer sb4=new StringBuffer("hello");
		sb4.reverse();
		System.out.println(sb4);       //op=olleh
		
		 
		//capacity method
		StringBuffer sb5=new StringBuffer();
		System.out.println(sb5.capacity());       //op=16
		StringBuffer sb6=new StringBuffer("hello");
		System.out.println(sb6.capacity());        //op=21
		StringBuffer sb7=new StringBuffer("hello this is my laptop");
		System.out.println(sb7.capacity());        //op=39
		
		
		//ensure capacity
		StringBuffer sb8=new StringBuffer();
		sb8.ensureCapacity(1);
		sb8.append("java");
		System.out.println(sb8.capacity());
		System.out.println(sb8);
		System.out.println(sb8.capacity());
		

		//contains by using if and else
		String s1="javatpoint java javaee";
		if(s1.contains("javatpoint")) {
			System.out.println("yes it is present in this link");
		}else {
			System.out.println("no records found"); 
		}
		
		
		
		


		
		
		
		

	}

}
