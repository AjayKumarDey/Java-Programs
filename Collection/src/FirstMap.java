import java.util.HashMap;
import java.util.Map;

public class FirstMap {
public static void main(String[] args) {
	Map<String,Integer>mp=new HashMap<>();
	mp.put("Ajay",33);
	mp.put("vivek", 23);
	mp.put("rahul", 29);
	mp.put("rajesh", 43);
	//System.out.println(mp);
	System.out.println(mp.get(33));
	
}
}
