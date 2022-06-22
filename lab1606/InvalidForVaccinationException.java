package lab1606;

public class InvalidForVaccinationException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidForVaccinationException() {
		System.out.println("Not eligible for booster dose vaccination ! !");
	}
}
