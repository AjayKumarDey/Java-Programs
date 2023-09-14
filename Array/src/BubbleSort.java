
public class BubbleSort {
public static void main(String[] args) {
	int a[]= {10,30,50,5,15,35};
	for (int i = 0; i < a.length; i++)
	{
		int temp;
		for (int j = 0; j < a.length-1; j++) 
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	for (int i = 0; i < a.length; i++) 
	{
		System.out.print(a[i]+" ");
	}
}
}
