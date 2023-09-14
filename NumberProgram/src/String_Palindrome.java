import java.util.Scanner;

public class String_Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	int len=str.length();
	String rev="";
	for(int i=0;i<len;i++)
	{
		char ch=str.charAt(i);
		rev=ch+rev;
	}
	//System.out.println("reverse string "+rev);
	if(str.equalsIgnoreCase(rev))
	{
		System.out.println("string is palindrome ");
		
	}
	else
	{
		System.out.println("string is not palindrome");
	}
}
}
