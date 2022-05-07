package May06;

public class LCM 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int lcm=240;
		int ratio_x=3;
		int ratio_y=4;
		
		int x= (ratio_x*lcm)/(ratio_x*ratio_y);
		int y= (ratio_y*lcm)/(ratio_x*ratio_y);
		//	System.out.println(x+" "+y);
		
		if(x<y) 
		{
			System.out.println("Smaller number is : "+x);
		}
		else 
		{
			System.out.println("Smaller number is : "+y);
		}
	}

}
