package Program;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String rev="";
	String name=sc.nextLine();
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
}
}
