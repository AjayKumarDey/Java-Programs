package arrayList;

import java.util.Comparator;

public class CityComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.getCity().compareTo(o2.getCity());
	}

}
