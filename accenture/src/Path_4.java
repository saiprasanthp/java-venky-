//retriving names from file whether it is correct are wrong
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Path_4 {
	static String[] userDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter acc_no");
		String acc_no=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		System.out.println("enter lastname");
		String lastname=sc.next();
		System.out.println("enter firstname");
		String firstname=sc.next();
		String[] userEntered=new String[5];
		userEntered[0]=username;
		userEntered[1]=acc_no;
		userEntered[2]=password;
		userEntered[3]=lastname;
		userEntered[4]=firstname;
		sc.close();
		return userEntered;	
		
	}
	static void validate(String[] userInfo) {
		String[] fileName=new String[7];
		int i=0;
		try {
			Path path=Paths.get("F:\\file.txt");
			Scanner d=new Scanner(path);
			while(d.hasNextLine())
			{
				fileName[i]=d.nextLine();
				i++;
			}
			String[] user=fileName[0].split(":");
			if(userInfo[0].equals(user[1])) {
				System.out.println("true");
				String[] user1=fileName[1].split(":");
				if(userInfo[1].equals(user1[1])) {
					System.out.println("true");
					String[] user2=fileName[2].split(":");
					if(userInfo[2].equals(user2[1])) {
						System.out.println("true");
						String[] user3=fileName[3].split(":");
						if(userInfo[3].equals(user3[1])) {
							System.out.println("true");
							String[] user4=fileName[4].split(":");
							if(userInfo[4].equals(user4[1])) {
								System.out.println("true");
								System.out.println("all are correct");

							}
							else 
							{
								System.out.println("first name:false");
							}d.close();
						}
					}
				}

			}
			else 
			{
				System.out.println("invalid details");
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String[] userInfo=userDetails();
		validate(userInfo);
	}
}
