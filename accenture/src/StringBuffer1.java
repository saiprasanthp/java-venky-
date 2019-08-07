
public class StringBuffer1 {

	public static void main(String[] args) {
        StringBuffer sd=new StringBuffer("hello world");
        System.out.println(sd.append("says hero"));     //to add any another name to given string
        System.out.println(sd.delete(1, 4));            //delete the index from 1 to 4
        System.out.println(sd.deleteCharAt(3));         //delete the character at index position
        System.out.println(sd.substring(1));            //to 
        System.out.println(sd.substring(1,2));
        System.out.println(sd.insert(1,"hello"));     //to insert another name at index position
        System.out.println(sd.replace(1, 2, "hiee")); //to replace the name and delete the present name
        System.out.println(sd.reverse());             //to repalce the string given inthe output
	}

}
