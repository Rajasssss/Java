package lab3006;


@SuppressWarnings("serial")
public class ElementGreaterThanLastLimitException extends Exception
{

	public ElementGreaterThanLastLimitException() 
	{
		super();
		System.out.println("Element should be less than last limit value");
	}
	
	

}
