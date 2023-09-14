import java.util.Scanner;

public class Piglatin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string ");
	int i;
	String str=sc.nextLine().toUpperCase();
	for ( i = 0; i < str.length(); i++)
	{
		char ch=str.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			break;
		}
		
	}
	String str1,str2;
	str1=str.substring(0,i);
	str2=str.substring(i);
	String nstr=str2+str1;
	System.out.println(nstr);
	
	
	
}
}
