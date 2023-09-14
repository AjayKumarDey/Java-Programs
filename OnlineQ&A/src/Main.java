
public class Main {
	static int fun(int x,int y)
	{
		if(x==0)
		{
			return y;
		}
		return fun(x-1,x+y);
	}
public static void main(String[] args) {
	System.out.println(fun(4,3));
}
}
