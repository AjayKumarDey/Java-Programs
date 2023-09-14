import java.util.Scanner;

public class Vote {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	if(n>=18)
	{
		System.out.println("you are eligble for vote");
	}
	else
	{
		System.out.println("sorry you are not eligible for vote");
	}
}
}
