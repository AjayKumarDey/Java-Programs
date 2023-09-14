package Program;

public class FactUsingRecursion
{
	static int fact=1;
	public void factorial(int n)
	{
		if(n>1)
		{
			fact=fact*n;
			factorial(n-1);
		}
				
	}
	public static void main(String[] args) {
		int no=5;
		FactUsingRecursion r=new FactUsingRecursion();
		r.factorial(no);
		System.out.println(fact);
	}
	

}
