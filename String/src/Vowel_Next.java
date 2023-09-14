import java.util.Scanner;

public class Vowel_Next {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine().toUpperCase();
	str=" "+str;
	char ch;
  int len=str.length();
  
  for (int i = 0; i < len; i++)
  {
	ch=str.charAt(i);
	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		ch++;
	}
	else
	{
		ch--;
	}
	System.out.print(ch);
  }
  
}
}
