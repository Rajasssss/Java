package lab0906;

public class CafeTejas extends RooftopPoolCafe 
{

	public CafeTejas(License l) 
	{
		super(l);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void welcomeDrink() 
	{				// Implementation of all abstract method
		System.out.println("Mojito !");

	}

	@Override
	public void ambiance() 
	{
		System.out.println("Open air dancefloor ");

	}

	@Override
	public void chilling() 
	{
		System.out.println("Mocktail and Beer counter beside pool");

	}

	@Override
	public void prepareKebab() 
	{
		System.out.println("All Kebab available but Turki is chef special");

	}

	@Override
	public void prepareChowmin() 
	{
		System.out.println("Recommended Mix Chow + Chillyfish Combo");

	}

	void tejasCafeOffer()				// child class specific method 
	{
		System.out.println("40% discount within happy hours");
	}

}