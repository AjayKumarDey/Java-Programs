package String;

import java.util.Scanner;

public class FirstUpper {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string ");
	String str=sc.nextLine();
	str=" "+str;
	int len=str.length();
	
	for(int i=0;i<len;i++)
	{
		char ch=str.charAt(i);
		if(ch==' ')
		{
			System.out.print(" "+Character.toUpperCase(str.charAt(i+1)));
			i++;
		}
		else
		{
			System.out.print(ch);
		}
	}
	
}
}
