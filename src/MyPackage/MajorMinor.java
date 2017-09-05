package MyPackage;

import java.util.Scanner;

public class MajorMinor {
	
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("age=");
		int age= in.nextInt();
	//	int minor= in.nextInt();
		
		if(age>=18)
			System.out.println("is major");
		else
			System.out.println("is minor");
		/*if (major>minor && major>18)
			System.out.println("major"+major);
		else
			if(minor<18)
			System.out.println("is minor"+minor);
			else
				System.out.println("not valid");*/
		
	}

}
