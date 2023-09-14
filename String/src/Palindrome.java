import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for (int i = s.length()-1; i>=0; i--)
		
		{
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome "+rev);
		}
		else
		{
			System.out.println("not palindrome "+rev);
		}
	}
}
