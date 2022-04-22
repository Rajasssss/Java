package April21;
class Parent
{
	void display()
	{
		System.out.println(" This is Parent class ");
	}
}
class child extends Parent
{
	void display()
	{
		System.out.println(" This is Child class ");
	}
}
public class OverRiding 
 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Parent p=new Parent();
		Parent c=new child();
		
		p.display();                 //overriding
		c.display();                //
	}

 }
