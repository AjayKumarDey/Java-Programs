import java.util.Scanner;

public class Count_word {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string ");
	String str=sc.nextLine();

	int len=str.length();
	int sp=0;
	for(int i=0;i<len;i++)
	{
		char ch=str.charAt(i);
		if(ch==' ')
		sp++;
	}
	System.out.print(sp+1);
	
	
	
}
}
