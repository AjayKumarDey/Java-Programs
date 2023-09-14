import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		int vc=0,cc=0;
		String str=sc.nextLine();
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'|| ch=='I'|| ch=='O'||ch=='U'||ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
			{
				vc++;
			}
			else
				cc++;
		}
		System.out.println("no of vowel "+vc);
		System.out.println("no of consonent "+cc);

}
}
