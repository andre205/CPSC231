public class Ch1Ex1
{
	public static void main(String[] argv)
	{	
		double rCals = 0;
		double bCals = 0;
		double sCals = 0;
		double sum = 0;
		
		rCals = .0175 * 10 * 30 * 150 / 2.2;
		bCals = .0175 * 8 * 30 * 150 / 2.2;
		sCals = .0175 * 1 * 360 * 150 / 2.2;
		sum = rCals + bCals + sCals;
		
		System.out.println("He burns " + sum + " calories.");
	}
}