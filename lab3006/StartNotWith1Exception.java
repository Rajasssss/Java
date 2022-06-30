package lab3006;


@SuppressWarnings("serial")
public class StartNotWith1Exception extends Exception 
{


	public StartNotWith1Exception() 
	{
		super();
		System.out.println("Series should start with 1");
	}
	
}
