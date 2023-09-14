import java.util.Scanner;

public class MainS {
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	String rev="";
	for (int i = str.length()-1; i>=0; i--) 
	{
		char ch=str.charAt(i);
		rev=rev+ch;
		 count++;
	}
	if(rev.equals(str))
	{
		System.out.println("palindrome "+count);
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
