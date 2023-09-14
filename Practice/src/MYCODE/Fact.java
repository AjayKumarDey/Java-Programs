package MYCODE;

public class Fact {
	int fact=1;
public static void main(String[] args) {
	int no=6;
	int result;
	Fact f=new Fact();
	result=f.factroical(no);
	System.out.println(result);
}
int  factroical(int n)
{
	if(n>1)
	{
		fact=fact*n;
		factroical(n-1);
	}
	return fact;
}

}
