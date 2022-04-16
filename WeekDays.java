package menudriven;
import java.util.*;
public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		boolean exit =false;
		
		do {
			System.out.println("Enter Num :   / 0 for Exit");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("Monday");
				break;
				
			case 2:
				System.out.println("Tuesday");
				break;
				
			case 3:
				System.out.println("Wednesday");
				break;
				
			case 4:
				System.out.println("Thursday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("Weekend");
				break;
				
			case 7:
				System.out.println("Weekend");
				break;
				
			case 0:
				System.out.println("Exited");
				exit=true;
				break;
				
			default :
				System.out.println("Enter Num Between 1-7");
				break;
			}
			
		}while(exit==false);
		
		
	}

}
