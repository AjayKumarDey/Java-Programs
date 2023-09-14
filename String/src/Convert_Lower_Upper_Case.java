import java.util.Scanner;

public class Convert_Lower_Upper_Case {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();
		for (int i = 0; i < str.length(); i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.print(Character.toLowerCase(ch));
			}
			else
			{
				System.out.print(Character.toUpperCase(ch));
			}
			}
		
		
			
		}
	}

