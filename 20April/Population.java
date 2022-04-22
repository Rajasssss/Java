package April21;

public class Population
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double Population = 175000;
		double Populationincreased = 262500;
		
		double totalincreased = Populationincreased-Population;
		double anuual_pop_inc = totalincreased/10;
		double peryear_percent = (anuual_pop_inc/Population)*100;
		System.out.println("percent per year " +peryear_percent);
	}

}
