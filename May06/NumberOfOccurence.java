package May06;

import java.util.Scanner;

public class NumberOfOccurence 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		String s="UV exposure increases the risk of potentially blinding eye diseases, if eye protection is not used. Overexposure to UV radiation can lead to serious health issues, including cancer. Skin cancer is the most common cancer in the United States.";
		System.out.println("String is : "+s);
		System.out.println("Enter word for counting: ");
		String m =sc.next();
		String compare=" ";
		int count =0;
		
		for (int i=0;i<s.length()-1;i++) 
		{
			char a= s.charAt(i);
			
			if(a!=' ') 
			{
				compare+=a;
//				System.out.println(compare);
				
				if(compare.equalsIgnoreCase(m)) 
				{
					count++;
//				System.out.println(count);
				}			
			}
			else
			{
				compare=" ";
			}	
		}		
		System.out.println("Count of user word is "+count);
		sc.close();
	}

}
