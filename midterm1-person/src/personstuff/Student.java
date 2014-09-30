package personstuff;

import java.util.Date;

public class Student extends Person{
	
	private static String Status;
	int NbrStudents;
	
	public Student(String Name, String Address, String Number, String Email) 
	{
		super(Name, Address, Number, Email);
		this.Status = Status;
		NbrStudents = NbrStudents + 1;
	}
	

}
