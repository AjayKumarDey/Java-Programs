package MYCODE;

public class Febo {
	 static int  a=0,b=1,c;
public static void main(String[] args) {
	
	/*
	 * System.out.print(a+" "+b+" "); for(int i=1;i<=10;i++) {
	 * 
	 * c=a+b; System.out.print(c+" "); a=b; b=c; }
	 */
	/*
	 * for(int i=1;i<=10;i++) { System.out.print(a+" "); c=a+b; a=b; b=c;
	 * 
	 * }
//	 */System.out.print(a+" "+b+" ");
	Febo f=new Febo();
	f.res(10);
	
}
void   res(int i)
{
	if(i>=1)
	{
		
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		res(i-1);
	}
	
}

}
