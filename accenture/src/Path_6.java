import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//getting the file roll number and getting the details done by own

public class Path_6 {
	static String[] getUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		String rollno=sc.next();
		String[] user=new String[2];
		user[0]=rollno;
		return user;	
	}
	static String[] fileDetails(String[] user) {
		String[] file=new String[31];
		int i=0;
		try {
			Path path=Paths.get("F:\\New Text Document (4).txt");
			Scanner san=new Scanner(path);
			while(san.hasNextLine()) {
				file[i]=san.nextLine();
				i++;
			}
			String[] Firstdata =file[0].split(":");
			String[] seconddata=file[10].split(":");
			String[] thirddata=file[20].split(":");
			if(user[0].equals(Firstdata[1])||user[0].equals(seconddata[1])||user[0].equals(thirddata[1])) {
				//System.out.println("true");
				file[i]="true";
				return file;	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		file[i]="false";
		return file;
	}
	public boolean check(String[] user,String[] result) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		//System.out.println("verify rollnumber"   );
		if(user[0].equals("101")||user[0].equals("102")||user[0].equals("103")) {
		switch(user[0]) {
		case "101":
			for(i=0;i<=9;i++) {
				System.out.println(result[i]);
				}
			break;
		case "102":
			for(i=10;i<=19;i++) {
				System.out.println(result[i]);
			}
			break;
		case "103":
			for(i=20;i<=29;i++) {
				System.out.println(result[i]);
			}
			break;
			default:
				System.out.println("no records found");
				break;
			}return true;
		}sc.close();
	return false;
	}
	void average(String[] user,String[] result) {
		Scanner scn=new Scanner(System.in);
 		System.out.println("enter name");
 		String name=scn.next();
		if(name.equals("ntr")&&user[0].equals("101")) {
			switch(name) {
			case "ntr":
				System.out.println("enter percentage");
				double perc=scn.nextDouble();
				if(perc>=60 && perc<=70) {
					System.out.println("he is eligible for btech");
				}
					else if(perc>=70 && perc<=80) {
						System.out.println("he is eligible for it employee");
					}
					else if(perc>=80 && perc<=90) {
						System.out.println("he is eligible for gov.employee");
					}else {
						System.out.println("fail");
					}
				break;
				default:
					System.out.println("fail");
					break;
			}
			}/*else {
				System.out.println("invalid user name");
		}*/
		else if(name.equals("pava")&&user[0].equals("102")) {
			switch(name) {
					
			case "pava":
				System.out.println("enter percentage");
				double perc=scn.nextDouble();
				if(perc>60 && perc<=70) {
					System.out.println("he is eligible for btech");
				}
					else if(perc>=70 && perc<=80) {
						System.out.println("he is eligible for it employee");
					}
					else if(perc>=80 && perc<=90) {
						System.out.println("he is eligible for gov.employee");
					}else {
						System.out.println("fail");
					}	
				break;
				default:
					System.out.println("fail");
					break;
			}
		}/*else {
			System.out.println("invalid name");*/
	//	}
		else if(name.equals("mahesh")&&user[0].equals("103")) {
			switch(name) {
			case "mahesh":
				System.out.println("enter percentage");
				double perc=scn.nextDouble();
				if(perc>60 && perc<=70) {
					System.out.println("he is eligible for btech");
				}
					else if(perc>=70 && perc<=80) {
						System.out.println("he is eligible for it employee");
					}
					else if(perc>=80 && perc<=90) {
						System.out.println("he is eligible for gov.employee");
					}else {
						System.out.println("fail");
					}
				break;
					
				default:
					System.out.println("fail");
					break;
			}			
			}else {
				System.err.println("invalid user name");
			}
		}
	public static void main(String[] args) {
		String[] user=getUser();
		String[] result=fileDetails(user);
		if(result[30].equals("true")) {
		Path_6 obj=new Path_6();
		boolean value=obj.check(user,result);
		if(value==true) {
			obj.average(user,result);
		}
		}
		else {
			System.err.println("records not found");
		}
	}

	}