
public class Insert {
public static void main(String[] args) {
	int a[]= {2,3,4,9,2,6,9};
	for (int i = 0; i < a.length-1; i++)
	{
		if(a[i]==a[i+1])
		{
			int temp=a[i];
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
}
