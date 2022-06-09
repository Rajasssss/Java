package lab0906;

public class RooftopPoolCafeMain {


	private static void callCafe() {

		RooftopPoolCafe r1 = new RooftopPoolCafeFactory().getRooftopPoolCafe();

		// getting rooftoppoolcafe object

		if (r1 !=null)
		{
			r1.welcomeDrink();
			r1.ambiance();
			r1.chilling();
			r1.prepareChowmin();
			r1.prepareKebab();

			if (r1 instanceof CafeRajas)		// downcasting or checking the type
			{
				((CafeRajas) r1).rajasCafeOffer();
			}

			else if (r1 instanceof CafeTejas)	// downcasting or checking the type
			{
				((CafeTejas) r1).tejasCafeOffer();;
			}


		}


		else {
			System.out.println("Try between Rohit Cafe or Nisha Cafe");
			}
	}

	public static void main(String[] args) {

		callCafe();					// refactor custom method to minimize main()

	}




}

