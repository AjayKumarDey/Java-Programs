import java.util.HashSet;

public class CommonArray {
	public static void main(String[] args) {
	int ar1[]= {32,54,2,56,2,9,32};
    int br1[]= {9,31,4,54,32,6,2};
    HashSet<Integer>hs=new HashSet<>();
    for (int i = 0; i < ar1.length; i++)
    {
		for (int j = 0; j < br1.length; j++)
		{
			if(ar1[i]==br1[j])
			{
				hs.add(ar1[i]);
			}
		}
	}
    for (Integer integer : hs) {
		System.out.println(integer);
	}
   
	   
	}
}

