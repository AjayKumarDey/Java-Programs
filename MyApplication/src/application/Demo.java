package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajaydb","root","Ajay@339");
	PreparedStatement ps = con.prepareStatement("update employee set name='modi' where city='bksc'");
	int i = ps.executeUpdate();
	if(i>0)
	{
		System.out.println("added..");
		
	}
	else
	{
		System.out.println("fail");
	}
	con.close();
	ps.close();
}
}
