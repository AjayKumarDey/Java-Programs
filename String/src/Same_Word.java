import java.util.Scanner;

public class Same_Word {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string ");
	String str=sc.nextLine();
	str=" "+str;
	str.toUpperCase();
	int count=0;
	for (int i = 0; i < str.length(); i++) 
	{
		char ch=str.charAt(i);
		if(ch==' ')
		{
		  ch=str.charAt(i+1);
			if(ch=='A'||ch=='a')
			count++;
		}
	}
	System.out.println(count);
	}
	
}
