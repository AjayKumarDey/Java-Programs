
public class Minimum {
public static void main(String[] args) {
	int pos=0;
	int ar[]= {32,44,3,33,55,1,76,8,21};
	int min=ar[0];
	for (int i = 0; i < ar.length; i++)
	{
		if(min>ar[i])
		{
			min=ar[i];
			pos=i;
		
		}
	}
	System.out.println("least is "+min+" position " +(pos+1));
}
}
