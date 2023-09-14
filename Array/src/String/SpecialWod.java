package String;
// COMIC MOM
import java.util.Scanner;

public class SpecialWod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string ");
	String str=sc.nextLine();
	String rev="";
	
	
int len=str.length();

for(int i=0;i<len;i++)
{
	char ch=str.charAt(i);
	{
		rev=ch+rev;
	}
	
}
if(str.equals(rev))
{
	System.out.println("palindrome and special word");
}
else
{
	char fchr,lchr;
	fchr=str.charAt(0);
	lchr=str.charAt(len-1);
	if(fchr==lchr)
	{
		System.out.println("it is only special word");
	}
	else
	System.out.println("not palindrome and not is special word ");
}
}
}
