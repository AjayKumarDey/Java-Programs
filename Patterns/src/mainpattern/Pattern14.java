package mainpattern;

import java.util.Scanner;

public class Pattern14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	String s=sc.nextLine();
		for (int i = 0; i <s.length(); i++) 
	{
		for (int j =0; j <=i; j++) 
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
	}
		for (int i = s.length()-2; i>=0; i--) 
		{
			for (int j =0; j <=i; j++) 
			{
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();
		}
}
}
