public class Ch1Ex2
{
	public static void main(String[]argv)
	{	
		int tickets = 888;
		int candybars = tickets/10;
		int gumballs = (tickets%10)/3;
		
		System.out.println("You can get " + candybars + " candy bars and " + gumballs + " gum balls.");	
	}
}