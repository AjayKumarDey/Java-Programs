import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FirstSet {
public static void main(String[] args) {
	Set<Integer>st=new TreeSet<>();
	//HashSet<Integer> hs=new HashSet<>();
	st.add(23);
	st.add(56);
	st.add(21);
	st.add(98);
	st.add(9);
	st.add(null);
	st.add(null);
	st.add(23);
	st.add(56);
	st.add(21);
	st.add(98);
	st.add(9);
	
	System.out.println(st);
	
	System.out.println(st.size());
	
}
}
