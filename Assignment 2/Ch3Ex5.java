import java.util.Scanner;

public class Ch3Ex5
{
	public static void main(String[] argv)
	{	
		Scanner input = new Scanner(System.in);
		float total = 1000;
		float cost = 1000;
		float payoff = 0f;
		float deduct = 0f;
		float interest = 0f;
		int nummonths = 0;
		
		//calculate interest and monthly payment, add 1 month to counter
		while (payoff < cost)
		{
			interest = (total * .015f);
			deduct = 50 - interest;
			
			payoff += deduct;		
			total -= deduct;
			
			nummonths += 1;
		}
		
		System.out.println("Months to payoff: " + nummonths);
	}
}