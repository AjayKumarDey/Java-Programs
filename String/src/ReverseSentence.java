import java.util.Scanner;

public class ReverseSentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	String rev="";
	for (int i =str.length()-1; i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);

	

}
}
