package String;

import java.util.Scanner;

public class Length {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string ");
	String s[]=new String[10];
	for(int i=0;i<s.length;i++)
	{
		s[i]=sc.nextLine();
	}
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()%2==0)
		
			System.out.print(s[i]+" ");
		
	}
	
}
}
