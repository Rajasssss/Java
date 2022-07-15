
/*
 * Q.2.	Accept two arraylist and 
 		check all the elements of second list in present in the first list or not 
 */

package lab1407;
import java.util.ArrayList;
import java.util.Objects;

public class CheckElementofArrayList {
	String name;
	String Dept;
		
public CheckElementofArrayList(String name, String dept) {
		super();
		this.name = name;
		Dept = dept;
	}

@Override
public String toString() {
	return " [name=" + name + ", Dept=" + Dept + "]";
}

@Override
public int hashCode() {
	return Objects.hash(Dept, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CheckElementofArrayList other = (CheckElementofArrayList) obj;
	return Objects.equals(Dept, other.Dept) && Objects.equals(name, other.name);
}

public static void main(String[] args) {
	CheckElementofArrayList s1= new CheckElementofArrayList("Rohit","ELEX");
	CheckElementofArrayList s2= new CheckElementofArrayList("Rajas","ELEX");
	
	CheckElementofArrayList s3= new CheckElementofArrayList("Rohit","ELEX");
	CheckElementofArrayList s4= new CheckElementofArrayList("Rajas","ELEX");
	
		
	ArrayList<CheckElementofArrayList> al=new ArrayList<CheckElementofArrayList>();
	al.add(s1);
	al.add(s2);
	
	ArrayList<CheckElementofArrayList> al1=new ArrayList<CheckElementofArrayList>();
	al1.add(s3);
	al1.add(s4);
	
	System.out.println(al.containsAll(al1));	
}
}