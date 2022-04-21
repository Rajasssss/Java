package thursday;

class Vehicle{                                                    //Super Class
	int wheelsCount;
	int speed ;
	
	void disp() 
  {
		System.out.println("Type is Vehicle");
	}

	
}


class Bike extends Vehicle
{                                                              //child class
	
	void disp() {
		System.out.println("Type is Bike");
	}
	void tyreCount() 
  {
		System.out.println("Bike/Bicycle is 2 wheeler");
	}
}
	
class Bicycle extends Bike
{                                                             //super child
	void speed(int speed) 
  {
		System.out.println("Speed of Bicycle is "+speed+"km/hr");
	}
}

class Car extends Vehicle 
{                                                              //child class
	void disp()
  {
		System.out.println("Type is Car");
	}
}

public class HierarAndMulti 
{
	public static void main(String[] args) 
  {
		Vehicle obj =new Vehicle();
		Bike obj1 =new Bike();
		Car obj2 =new Car();
		Bicycle obj3 =new Bicycle();
		
		//hierarchical
		obj.disp();        //
		obj1.disp();       // OverRiding 
		obj2.disp();       //
		
		//multilevel
		obj1.tyreCount();        
		obj3.tyreCount();    
		obj3.speed(10);   
		
	}
}
