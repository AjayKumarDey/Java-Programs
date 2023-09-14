import java.util.Scanner;

public class Aasci_Value {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	System.out.println("word  & aasci value");
	for (int i = 0; i <s.length(); i++)
	{
		char ch=s.charAt(i);
		System.out.println(ch+"    "+(int)ch);
	}
}
}
