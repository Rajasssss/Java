package lab3006;


@SuppressWarnings("serial")
public class ElementOutOfBondException extends Exception 
{

	public ElementOutOfBondException() 
	{
		super();
		System.out.println("Number Shouldn't be greater than Last limit value");
	}
	

}
