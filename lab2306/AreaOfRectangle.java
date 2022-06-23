package lab2306;

public class AreaOfRectangle 
{
	private int length;
	private int breadth;
	
	public int getLength() 
	{
		return length;
	}
	public void setLength(int length) 
	{
		if(length<=10 || length>=50) 
		{
			System.out.println("Length upto 10 to 50");
		}
		this.length = length;
	}
	public int getBreadth() 
	{
		return breadth;
	}
	public void setBreadth(int breadth) 
	{
		if(breadth<=5 || breadth>=20) 
		{
			System.out.println("Breadth upto 5 to 20");
		}
		this.breadth = breadth;
	}
	public AreaOfRectangle(int length, int breadth) 
	{
		
		setLength(length);
		setBreadth(breadth);
	}
	
	void getArea() 
	{
		if (getBreadth()<=20 && getBreadth()>=5) 
		{
			if (getLength()<=50 && getLength()>=10) 
			{
				System.out.println(getBreadth()* getLength());
			}
			else 
			{
				System.out.println("Error of length!");
			}
		}
		else 
		{
			System.out.println("Error of breadth");
		}
	}

}
