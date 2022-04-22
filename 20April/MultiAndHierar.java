package April21;
class Mobile                              //Parent class Multi level
{
	void type()
	{
		System.out.println("This is Mobile");
	}
	void chargingcable()
	{
		System.out.println("Charging cable is used");
	}
}

class Android extends Mobile             //child class Multi level
{
	void type()
	{
		System.out.println("This is Android Mobile");
	}
	void chargingcable()
	{
		System.out.println("C-type cable is used");
	}
}

class Lenovo extends Android             //super child class Multi level
{
	void type()
	{
		System.out.println("This is Lenovo Android Mobile");
	}
}

class Ios extends Mobile                 //child class Hierarchical
{
	void type()
	{
		System.out.println("This is iOS Mobile");
	}
	void chargingcable()
	{
		System.out.println("Lightning-type cable is used");
	}
}
public class MultiAndHierar 
{
public static void main(String[] args)
 {
	Mobile  m=new Mobile();
	Android a=new Android();
	Lenovo  l=new Lenovo();
	Ios     i=new Ios();
	
	//overriding
	m.type();
	a.type();
	l.type();
	i.type();
	
	
	//multi level
	m.chargingcable();              //super parent class
	a.chargingcable();              // child class
	l.chargingcable();              // super child class
	
	//hierarchical
	m.chargingcable();               // parent class
	a.chargingcable();              // child class
	i.chargingcable();             // child class
	
 }
}
