import java.util.Scanner;

public class Avrage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	int sum=a+b+c+d+e;
	System.out.println("sum of total :"+sum);
	double avg=sum/5;
	System.out.println("avg of "+avg);
}
}
