package Chaing;

public class Student {
int StudentId;
String StudentName;
static String StudentCity;


public Student(int studentId, String studentName, String studentCity) {
	super();
	StudentId = studentId;
	StudentName = studentName;
	StudentCity = studentCity;
System.out.println(this.StudentId+" "+this.StudentName+" "+this.StudentCity);

}
public Student()
{
	System.out.println(StudentId);
	{
		StudentId=StudentId;
		System.out.println(this.StudentId);
	}
}


public static void main(String[] args) {
	Student s1=new Student(1,"ajay","bng");
	Student s2=new Student(2,"rahul","bng");
	Student s3=new Student(3,"vivek","bng");
	Student s4=new Student(4,"akshay","bng");
	
	
	
}
}

