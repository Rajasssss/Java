package mypack1;

public class Employee {
	String fieldname;
	String name;
	double salary;
	String location;
	Employee(String fn , String n , double s ,String l){
		fieldname=fn;
		name=n;
		salary =s;
		location =l;
	}
	
	 void display() {
		System.out.println("Field Name    :" +fieldname );
		System.out.println("Employee Name :" +name );
		System.out.println("Salary        :" +salary );
		System.out.println("Location      :" +location );

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e =new Employee("MECH","MAHESH",260000,"Chennai");
		e.display();
		
	}

}
