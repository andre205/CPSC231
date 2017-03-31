import java.util.Random;

public class Ch3Ex2
{
	public static void main(String[] argv)
	{	
	float wins = 0;
	float losses = 0;
	float prob = 0;
	Random r = new Random();
	
	//repeat for 10,000 iterations
	for (int i = 0; i<10000; ++i)
	{	
		//roll and sum
		int roll1 = r.nextInt(6)+1;
		int roll2 = r.nextInt(6)+1;		
		int sum = roll1 + roll2;
		
		if ((sum == 7) || (sum == 11))
		{
			wins += 1;
		}
		
		else if ((sum == 2) || (sum == 3) || (sum == 12))
		{
			losses += 1;
		}
		
		//if no win/loss reroll until win/loss
		else 
		{
			int roll3 = r.nextInt(6)+1;
			int roll4 = r.nextInt(6)+1;
			int sum2 = roll3 + roll4;
			
			while ((sum2 != 7) && (sum2 != sum))
			{
				roll3 = r.nextInt(6)+1;
				roll4 = r.nextInt(6)+1;
				sum2 = roll3 + roll4;
			}
			
			if (sum2 == 7)
			{
				losses += 1;	
			}
				
			else if (sum2 == sum)
			{
				wins += 1;
			}						
		}			
	}	
	
	//calculate and display win/loss and probability
	prob = wins/(wins+losses);
	System.out.println("Probability of winning: " + prob);
	System.out.println("W " + wins);
	System.out.println("L " + losses);
	}
}