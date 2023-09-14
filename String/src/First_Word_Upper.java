import java.util.Scanner;

public class First_Word_Upper {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string ");
	String str=sc.nextLine();
	str=" "+str;
	for (int i = 0; i < str.length(); i++)
	{
		char ch=str.charAt(i);
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
	System.out.println();
	
	}
}
