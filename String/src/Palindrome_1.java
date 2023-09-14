import java.util.Scanner;

public class Palindrome_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String str=sc.next();
	 String rev="";
	 for (int i =str.length()-1; i >=0;i--) {
		 char ch=str.charAt(i);
		 rev=rev+ch;
		 
	}
	 System.out.println("reverse = "+rev);
	 if(str.equals(rev))
	 {
		 System.out.println("String is palindrome "+rev);
	 }
	 else
	 {
		 System.out.println("string is not palindrome "+rev);
	 }
}

}
