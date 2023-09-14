package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
public static void main(String[] args) {
	ArrayList<Emp>ar=new ArrayList<>();
	ar.add(new Emp(763,"ajay","bksc"));
	ar.add(new Emp(545,"rahul","ranchi"));
	ar.add(new Emp(111,"act","dnb"));
	ar.add(new Emp(323,"abhimanyu","wb"));
	System.out.println(ar);
	//implements comparable
Collections.sort(ar,new idComparator());
System.out.println(ar);
	ArrayList<Emp>ar1=new ArrayList<>(ar);
Collections.sort(ar1,new NameComparator());
	System.out.println(ar1);
	ArrayList<Emp>ar2=new ArrayList<>(ar1);
	Collections.sort(ar2,new CityComparator());
	System.out.println(ar2);
	

	
	
}
}
