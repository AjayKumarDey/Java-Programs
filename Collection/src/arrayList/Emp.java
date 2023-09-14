package arrayList;

public class Emp {
 private int id;
private String name;
private String city;

//@Override
//public int compareTo(Emp o) {
//	// TODO Auto-generated method stub
//	return id-o.id;
//}

public Emp(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId() + ", getName()=" + getName()
			+ ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


}
