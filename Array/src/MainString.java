import java.util.Scanner;

public class MainString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	String a=s;
	for (int i = s.length()-1; i >=0; i--) 
	{
	 char ch=s.charAt(i);
	 System.out.print(ch);
	}
}
}
