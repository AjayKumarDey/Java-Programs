
public class SelectionSort {
public static void main(String[] args) {
	int a[]= {23,54,76,12,16,98};
	int temp;
	for (int i = 0; i < a.length; i++)
	{
		int max=i;
		for (int j = i+1; j < a.length; j++) 
		{
			if(a[j]>a[max])
			{
				max=j;
			}
		}
		temp=a[i];
		a[i]=a[max];
		a[max]=temp;
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]+" ");
	}
}

}
