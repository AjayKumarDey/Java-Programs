package String;

import java.util.Scanner;

public class ReverseWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	str=str+" ";
	String rev="";
	int len=str.length();
	
	for(int i=0;i<len;i++)
	{
		char ch=str.charAt(i);
		if(ch!=' ')
		{
			rev=ch+rev;
		}
		else
		{
			System.out.print(rev+" ");

			rev="";
		}
	}
}
}
