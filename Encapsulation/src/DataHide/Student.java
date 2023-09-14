package DataHide;

public class Student {
    private  int StudentId;
    private String StudentName;

public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		if(studentId<1)
		{
			System.out.println("invalid id ");
		}
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		if(studentName != "ajay")
		{
			System.out.println("invalid name");
		}
		StudentName = studentName;
	}

public void DataShow()
{
	System.out.println(StudentId+" "+StudentName);
}

}
