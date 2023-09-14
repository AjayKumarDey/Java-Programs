import java.util.Scanner;

public class ConcatinateToString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st string ");
	String str1=sc.nextLine();
	System.out.println("enter the 2nd string ");
	String str2=sc.nextLine();
	String ns="";
	int len=str1.length();
	char ch1,ch2;
	for (int i = 0; i < len; i++)
	{
		ch1=str1.charAt(i);
		ch2=str2.charAt(i);
		ns=ns+ch1+ch2;
		
	}
	System.out.println(ns);
	
}
}
