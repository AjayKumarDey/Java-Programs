package String;

import java.util.Scanner;

public class Vowel {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the char ");
	char ch[]=new char[5];
	for(int i=0;i<ch.length;i++)
	{
		ch[i]=sc.nextLine().charAt(0);
	}
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(Character.isUpperCase(ch[i]))
			count++;
		System.out.print((ch[i]+" "));
	}
	System.out.println("total count is "+count);
}
}
