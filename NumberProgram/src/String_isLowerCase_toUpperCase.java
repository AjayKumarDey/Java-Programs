import java.util.Scanner;

public class String_isLowerCase_toUpperCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	str=" "+str;
	char ch;
	int len=str.length();
	for(int i=0;i<len;i++)
	{
		 ch=str.charAt(i);
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
