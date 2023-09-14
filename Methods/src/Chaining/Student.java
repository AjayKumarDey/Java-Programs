package Chaining;

public class Student {
private String name;
private int age;
private String City;

public Student setName(String name) {
	return this;
}

public Student setAge(int age) {
	return this;
}
public Student setCity(String city) {
	return this;
}

@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", City=" + City 
			+  ", toString()=" + super.toString() + "]";
}


}
