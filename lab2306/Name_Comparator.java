package lab2306;

import java.util.Comparator;

public class Name_Comparator implements Comparator<StudentClass>   // comparison function
{

	@Override
	public int compare(StudentClass o1, StudentClass o2)          // compare its two arguments for order
	{
		// TODO Auto-generated method stub
		return o1.name.compareToIgnoreCase(o2.name);             //compare two strings
	}                                                           
	

}
