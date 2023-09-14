
public class Factorial {
	
		static  int  fact=1;
	public static void main(String[] args)
	{
		int n=5;
		Factorial f=new Factorial();
		           f.refact(n);
		           System.out.println("factorial of "+n+" " +fact);
	}
	 void refact(int n)
	 {
		 if(n>=1)
		 {
			 fact=fact*n;
			 refact(n-1);
		 }
	 }
	 
	}

