package lab2306;

import java.util.Arrays;

public class StudentClassMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentClass obj1 = new StudentClass("RAJAS","MATHS",4,61);
		StudentClass obj2 = new StudentClass("JAY","CHEMISTRY",8,78);
		StudentClass obj3 = new StudentClass("SACHIN","PHYSICS",5,89);
		StudentClass obj4 = new StudentClass("SIDDHESH","PYTHON",12,100);
		StudentClass obj5 = new StudentClass("RAM","JAVA",25,66);
		
		StudentClass [] arr = {obj1,obj2,obj3,obj4,obj5};
		
		Arrays.sort(arr, new Name_Comparator());           //all elements in the arrays must be mutually comparable by the specified comparator
		
		System.out.println("---------------------------------------------------------------------- ");
		
		for(StudentClass s : arr) 
		{
			System.out.println(s+ " ");
			System.out.println("---------------------------------------------------------------------- ");
		}
	}

}
