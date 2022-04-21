package thursday;
class OverRiding
{
	void display()
  {
		System.out.println(" OverRiding");
	}
}


class OverRidingChild extends OverRiding 
{
	void display() 
  {
		System.out.println(" OverRidingChild");
	}


	public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
		OverRiding d=new OverRidingChild();
		OverRiding d1=new OverRiding();
		
		r.display();
		r1.display();
	}

}
