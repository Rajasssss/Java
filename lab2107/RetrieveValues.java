package lab2107;

/*
 * 2.Retrieve a value associated with a given key from the HashMap .
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("unused")
public class RetrieveValues
{

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		java.util.Scanner sc= new java.util.Scanner(System.in);

		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Pranav");
		map.put(2, "Rajas");
		map.put(3, "Rohit");
		map.put(4, "Shubham");
		
		
		System.out.println("Enter the key : ");
		int a = sc.nextInt();
		
		
		System.out.println(map.get(a)); 
		
	}

}