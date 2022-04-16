package menudriven;
import java.util.*;
public class SalaryAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Salary of first employee");
		int employee1=sc.nextInt();
		
		System.out.println("Enter Salary of second employee");
		int employee2=sc.nextInt();
		
		
		int avg= 10000;
		System.out.println("Average Salary of 3 Employees : "+avg);
		
	
		int employee3=(avg*3)-(employee1+employee2);
		
		System.out.println("Salary of first Employee is : "+employee1);
		System.out.println("Salary of second Employee is : "+employee2);
		System.out.println("Salary of third Employee is : "+employee3);

				
		
		

	}

}
