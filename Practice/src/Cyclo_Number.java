import java.util.Scanner;

public class Cyclo_Number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int ld=n%10;
	int count=0;
	int a=n;
	int dig=0;
	while(n>0)
	{
	dig=n%10;
	count++;
	n=n/10;
	}
	if(dig==ld)
	{
		System.out.println(a+" last and first "+dig+" "+ld+" its cyclo "+ count);
	}else
	{
		System.out.println("its not cyclo "+ count);
	}
}
}
