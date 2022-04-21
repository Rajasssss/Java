package thursday;

public class PopulationRate 
{
	public static void main(String[] args)
  {
		// TODO Auto-generated method stub
		double population =175000;
		double populationAfterDecade=262500;
		
		double increasedPopulation = populationAfterDecade-population;
		System.out.println("Increased Population "+increasedPopulation);
		double increasedPopulationPerYear =increasedPopulation/10;
		System.out.println("Increased population per year "+increasedPopulationPerYear);
		
		
		double avgPercentPerYear =(increasedPopulationPerYear/population)*100;
		System.out.println("Average percent increase per year is "+avgPercentPerYear+"%");
	}		
}
