
public class Bubble {
public static void main(String[] args) {
	int arr[]= {7,4,8,2,9,31,11};
	int l=arr.length;
	for (int i = 0; i <l; i++)
	{
		for (int j = 1; j < l; j++)
		{
			if(arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for (int i = 0; i < arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
