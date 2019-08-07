/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/

import java.util.Scanner;
public class IfCondition99 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sex");
		char sex=sc.next().charAt(0);
		System.out.println("enter age");
		int age =sc.nextInt();
		System.out.println("enter marriage status");
		char status=sc.next().charAt(0);

		if(sex=='f') {
			System.out.println("works only in urban area");	
		}	
		else {
			if((sex=='m' && ((status=='y')||(status=='n')))&&((age>=20) && (age<=40 )) ){
				System.out.println("he works in any condition");	
			}
			else if((sex=='m' && status=='n')&&((age>=40)&&(age<=60)) ) {
				System.out.println("he will works only in urban");

			}else {
				System.out.println("error");
			}sc.close();
		}


	}
}

