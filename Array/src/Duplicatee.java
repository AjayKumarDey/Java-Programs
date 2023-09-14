import java.util.HashSet;
import java.util.Set;

public class Duplicatee {
public static void main(String[] args) {
	int arr[]= {20,20,10,20,30,10,20,50,60,70,30};
	Set<Integer>d=new HashSet<>();
	for (Integer integer : arr) 
	{
		if(d.add(integer)==false)
		{
			System.out.print(integer+" ");
		}
	}
   
	
}

}
