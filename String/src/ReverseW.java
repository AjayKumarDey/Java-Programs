import java.util.Scanner;

public class ReverseW {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	int len;
	char ch;
	String str=sc.nextLine();
	str=str+" ";
	String rev="";
	len=str.length();
	for(int i=0;i<len;i++)
	{
	 ch=str.charAt(i);
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
