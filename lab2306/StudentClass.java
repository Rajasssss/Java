package lab2306;

public class StudentClass
{
	String name;                          //detail of students
	String subject;
	int rollno;                           //detail of students
	int marks;                            //detail of students
	
	public StudentClass(String name, String subject, int rollno, int marks) 
	{
		super();
		this.name = name;
		this.subject = subject;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	@Override                               //method declaration in supertype
	public String toString() 
	{
		return "StudentClass [name=" + name + ", subject=" + subject + ", rollno=" + rollno + ", marks=" + marks + "]";
	}	
}

