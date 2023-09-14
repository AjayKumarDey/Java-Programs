package MYCODE;

public class PArm {
public static void main(String[] args) {
	int n=153, dig,sum=0;
	int a=n;
	while(n>0)
	{
		dig=n%10;
		n=n/10;
		sum=sum+dig*dig*dig;
	}
	if(a==sum)
	{
		System.out.println("armstrong");
	} else
	{
		System.out.println("not armstrong");
	}
}
}
