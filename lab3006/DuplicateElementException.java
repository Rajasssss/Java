package lab3006;

@SuppressWarnings("serial")
public class DuplicateElementException extends Exception 
{

	public DuplicateElementException() 
	{
		super();
		System.out.println("Elements should not repeat");
	}

	
}
