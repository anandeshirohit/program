package MyPackage;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		System.out.println("enter a number");
		int n =in.nextInt();
		int f=1;
		
		for(int i=n;i>=1;i--){
			f=f*i;
			System.out.println("Factorial="+f);
		}
	}
	
	
			
	

}
