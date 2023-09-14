import java.util.Scanner;

public class Palindrome1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	String rev="";
	for (int i = 0; i < str.length(); i++) 
	{
		char ch=str.charAt(i);
		rev=ch+rev;
	}
	if(str.equals(rev))
	{
		System.out.println("palindrome ");
	}
	else
	{
		System.out.println("not palindrome");
	}
	
}
}
