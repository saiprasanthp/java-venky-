//stringconcept
public class StringDemo {

	public static void main(String[] args) {
		String name="welcome ";
		System.out.println(name);
		String s=new String("hello");
		System.out.println(s);
		System.out.println(name.length());    //to find the length of a string
		System.out.println(s.length());      //to find the length of a string
        System.out.println(name.charAt(5));   //to find the insex position
        System.out.println(s.charAt(4));     //to find the index position
        System.out.println(name.concat(s));   //to add two strings
        System.out.println(s.concat(name));   //to add two strings
        String s1="abc";
        String s2 =new String("ABC");
        System.out.println(s1.equals(s2));       //equalsmethod is used to say the s1 and s2 are true r false
        System.out.println(s1.equalsIgnoreCase(s2)); //eIC is ignore te cases and returns boolean value
        
        
	}

}
