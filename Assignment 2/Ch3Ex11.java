import java.util.Random;

public class Ch3Ex11
{
	public static void main(String[] argv)
	{	
	
	Random rand = new Random();
	
		while(true)
		{		
		//generate 2, check if equal, generate 3rd, check if equal, print all 3
		int pick1 = (rand.nextInt(30)+1);
		int pick2 = (rand.nextInt(30)+1);
	
			if (pick2 != pick1)
			{
				int pick3 = (rand.nextInt(30)+1);
				if (pick3 != pick2 && pick3 != pick1)
				{
					System.out.println("Pick1: " + pick1);
					System.out.println("Pick2: " + pick2);
					System.out.println("Pick3: " + pick3);
					break;
				}
			}
		}
	}
}