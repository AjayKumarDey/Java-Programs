import java.util.Scanner;

public class Count_Word {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int word=0;
	System.out.println("enter the number");
	String str=sc.nextLine();
	for (int i = 0; i < str.length(); i++)
	{
		char ch=str.charAt(i);
		if(ch==' ')
		{
			word++;
		}
	}
	System.out.println(word+1);
	
}
}
