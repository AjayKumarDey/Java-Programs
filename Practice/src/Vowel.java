import java.util.Scanner;
public class Vowel {
	public static void main(String[] args) {
		System.out.println("enter the character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
			System.out.println(ch+" is Vowel");
		else
			System.out.println(ch+" is consonant");
		
	}
	}

