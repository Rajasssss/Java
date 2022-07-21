package lab2107;

/*
 * 3.Create a Teacher class and take name and subject as properties. Create some objects of teacher.
  delete a teacher based on the name and subject given by a user.
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Teacher
{
	
	private String name,sub;
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getSub() 
	{
		return sub;
	}

	public void setSub(String sub) 
	{
		this.sub = sub;
	}

	public Teacher(String name, String sub) 
	{
		this.setName(name);
		this.setSub(sub);
	}
	
	
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(name, sub);
	}

	@Override
	public boolean equals(Object obj) 
	{
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(sub, other.sub);
	}

	@Override
	public String toString() 
	{
		return "[name=" + name + ", sub=" + sub + "]";
	}

	public static void main(String[] args) {

		Teacher t1=new Teacher("Samik","Java");
		Teacher t2=new Teacher("Lalita","Python");
		

		LinkedHashMap< Teacher, String> lmap = new LinkedHashMap<Teacher, String>();
		
		lmap.put(t1,t1.getName());
		lmap.put(t2,t2.getName());
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name of Teacher you want to remove : ");
		String n =sc.nextLine();
		
		System.out.println("Enter Subject of Teacher you want to remove : ");
		String s =sc.nextLine();
		
		lmap.remove(new Teacher(n,s));
		
//		if(n.equalsIgnoreCase(t1.getName()) && s.equalsIgnoreCase(t1.getSub())) {
//			lmap.remove(t1);
//		}
//		else if(n.equalsIgnoreCase(t2.getName()) && s.equalsIgnoreCase(t2.getSub())) {
//			lmap.remove(t2);
//		}

		System.out.println("After removing.... "+"\n the result is ");
		
		for(Map.Entry<Teacher, String> lm : lmap.entrySet()) 
		{
			System.out.println(lm.getKey());
		}
		
		
		
	}

}

