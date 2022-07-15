package lab1407;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Rem_Duplicate_Emp {
	String emp_name;
	String Dept;
	
	public Rem_Duplicate_Emp(String emp_name, String dept) {
		super();
		this.emp_name = emp_name;
		Dept = dept;	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Dept, emp_name);
	}

	@Override
	public boolean equals(Object obj) {
		
		Rem_Duplicate_Emp other = (Rem_Duplicate_Emp) obj;
		return Objects.equals(Dept, other.Dept) && Objects.equals(emp_name, other.emp_name);
	}

	@Override
	public String toString() {
		return "[emp_name=" + emp_name + ", Dept=" + Dept + "]";
	}

	public static void main(String[] args) {
		
		Rem_Duplicate_Emp e1=new Rem_Duplicate_Emp("Rajas","ELEX");
		Rem_Duplicate_Emp e2=new Rem_Duplicate_Emp("Rohit","ELEX");
		Rem_Duplicate_Emp e3=new Rem_Duplicate_Emp("Ram","COMPS");
		Rem_Duplicate_Emp e4=new Rem_Duplicate_Emp("Sanket","MECH");
		Rem_Duplicate_Emp e5=new Rem_Duplicate_Emp("Rohit","ELEX");
		
		ArrayList<Rem_Duplicate_Emp> al = new ArrayList<Rem_Duplicate_Emp>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
				
		Set<Rem_Duplicate_Emp> al1 = new LinkedHashSet<Rem_Duplicate_Emp>();
		al1.addAll(al);
		
		for(Rem_Duplicate_Emp s : al1) {
			if(!al1.equals(al)) {
				System.out.println(s +" ");
			}
		}
		
	}
}
