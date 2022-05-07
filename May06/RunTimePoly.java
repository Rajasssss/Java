package May06;

class Smartphones
{
	void processor() 
	{
		System.out.println("Smartphone has well-developed prossesor");
	}
}

class Oneplus6T extends Smartphones
{
	void processor() 
	{
		System.out.println("Oneplus6T has Snapdragon845 processor");
	}
	void battery()
	{
		System.out.println("Oneplus6T has 3700mAh battery");
	}
	
}
public class RunTimePoly 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Smartphones pr=new Oneplus6T();  
		Oneplus6T b=(Oneplus6T)pr;
		
		pr.processor();
		b.battery();
	}

}
