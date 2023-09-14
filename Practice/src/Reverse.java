import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before the swap =>"+a+ " " +b);
		temp=a;
		  a=b;
		  b=temp;
		  System.out.println("after the swap =>"+a+ " " +b);

		}
}
