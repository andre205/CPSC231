public class Ch1Ex4
{
	public static void main(String[] argv)
	{	
		int desiredweight = 150;		
		int startingweight = 200;
		double sToKillMouse = .003;
		int mouseweight = 1;
		double sInSoda = .001;
		double sodas = 0;
		
		sodas = sToKillMouse/sInSoda * mouseweight * desiredweight;
		System.out.println("It will take " + sodas + " sodas to kill you.");	
	}
}