package lab0707;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number = ");
		try (Scanner sc = new Scanner(System.in)) 
		{
			int num= sc.nextInt();
			
			System.out.println("Convert Decimal To Binary ");
			System.out.println("Output is ... ");
			
			Stack<Integer> stack= new Stack<>();
			while(num>0) 
			{
				int d= num%2;                         //reminder value stored in variable d
				stack.push(d);                        //int d value stored in stack
				num= num/2;
			}
			while(!(stack.isEmpty()))                 //true if and only if this vector hasno components, that is, its size is zero; false otherwise.
			{
				System.out.print(stack.pop());       //Removes the object at the top of this stack and returns that object as the value of this function
			}
		}
	}
}
