package April21;

public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double candidate1 = 1136;
		double candidate2 = 7636;
		double candidate3 = 11628;
		
		double totalvotes = candidate1+candidate2+candidate3;
		
		if ( candidate1>candidate2 && candidate1>candidate3)
		{
			double winningPercent = (candidate1/totalvotes)*100;
			System.out.println("Candidate 1 is Winner and winning Percentage is " +winningPercent);
		}
		if ( candidate2>candidate3 && candidate2>candidate1)
		{
			double winningPercent = (candidate2/totalvotes)*100;
			System.out.println("Candidate 2 is Winner and winning Percentage is " +winningPercent);
		}
		if ( candidate3>candidate2 && candidate3>candidate1)
		{
			double winningPercent = (candidate3/totalvotes)*100;
			System.out.println("Candidate 3 is Winner and winning Percentage is " +winningPercent);
		}
	}

}
