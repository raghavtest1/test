import java.util.Scanner;


public class UIInput {

	public static void main(String[] args) {
		MadeInHeaven mih=new MadeInHeaven();
		int totalCustomersAllowed=1;
		while(totalCustomersAllowed <= 3)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter your name ");
			String name=sc.nextLine();
			boolean doesUserExist=mih.validateName(name);
			if(doesUserExist)
			{
				System.out.println("Userid already taken");
				continue;
			}
			
			System.out.println("Please enter your telephone ");
			long tel=sc.nextLong();
			
			System.out.println("Please enter your hobby");
			String hbby=sc.next();
			
			boolean reg=mih.register(name, hbby, tel);
			if(reg)
				totalCustomersAllowed++;
			
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name to find a match");
		String findAMatch=sc.next();
		mih.findMatch(findAMatch);

	}

}
