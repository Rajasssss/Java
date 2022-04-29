package April28;

import java.util.Scanner;

public class EqualMethod 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First String : ");
		String s1=sc.nextLine();
		
		System.out.println("Enter the Second String : ");
		String s2=sc.nextLine();
		
		System.out.println(s1.intern()==s2.intern());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		sc.close();
	}

}
