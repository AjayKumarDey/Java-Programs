import java.util.Scanner;

public class NewChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		char chr;
		String str=sc.next();
		String word="";
      		for (int i = 0; i < str.length(); i++) 
      		{
				char ch=str.charAt(i);
				if(ch=='A'||ch=='E'|| ch=='I'|| ch=='O'||ch=='U'||ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
				{
					chr=(char)(ch+1);
					word=word+chr;
					//word=word+(char)(ch+1);
				}
				else
				{
					word=word+ch;
				}
			}
      		System.out.println(word);
		
}
}