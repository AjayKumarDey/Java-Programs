import java.util.Scanner;

public class Each_CharacterUppper {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	str=" "+str;
	for (int i = 0; i < str.length(); i++)
	{
	char	ch=str.charAt(i);
	if(ch==' ')
	{
		ch=str.charAt(i+1);
		//System.out.print(ch);
		System.out.print(Character.toUpperCase(ch)+".");
	}
	}
	
	
}
}
