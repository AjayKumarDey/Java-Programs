import java.util.Scanner;

public class ReverseCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String st=sc.nextLine();
		String rs=reverse(st);
	}

	static String reverse(String st)
	{
		String temp=" ";
		char ch[]=st.toCharArray();
		for (int i = ch.length-1; i>=0; i--)
		{
			temp=temp+ch[i];
		}
	System.out.println(temp);
		return temp;

	}
}
