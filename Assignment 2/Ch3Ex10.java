import java.util.Random;
import java.util.Scanner;

//I did this same assignment in python and just copied it to java
public class Ch3Ex10
{
	public static void main(String[] argv)
	{	
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	int psum = 0;
	int csum = 0;
	int pturn = 0;
	int cturn = 0;
	int turn = 1; //player (cpu = 0)
	int r = 0;
	
	while(psum < 100 && csum < 100)
	{
		if (turn == 1)
		{
			if (pturn == 0)
			{
			System.out.println("It's your turn. The score is You: " + psum + " | Computer: " + csum);
			}	
				
			r = (rand.nextInt(6)+1);
			System.out.println("You rolled a " + r);
				
				if (r == 1)
				{
					System.out.println("Sorry, no points this turn.");
					pturn = 0; //no points
					turn = 0; //cpu turn
				}
				
				else if (r != 1)
				{
					pturn += r;
					System.out.println("Your turn total is: " + pturn);
					System.out.println("Would you like to roll again? (Type 1 to hold, or enter any other number to reroll)");
					int re = input.nextInt(); //I couldnt get 'h' to work
					
					if (re == 1)
					{
						psum += pturn; //add turn total to game total
						turn = 0; //cpu turn
						pturn = 0; //reset player turn total
						System.out.println("Your game total is: " + psum);	
					}				

					else
					{
						continue;
					}
				}	
		}			
		
		
		else if (turn == 0)
		{
			System.out.println("___________________________________________________________________\n");
			System.out.println("It is the computer's turn. The computer's current score is: " + csum);
			
			while (cturn < 20 && turn == 0)
			{
				r = (rand.nextInt(6)+1);
				if (r == 1)
				{
					turn = 1; //player turn
					cturn = 0; //reset cpu turn total
				}
				
				else if (r != 1)
				{
					cturn += r;
					if (cturn + csum >= 100) //skips to cpu victory if <20 pts needed
					{
						break;
					}
				}
			}

			csum += cturn; //adds pts to total
			turn = 1; //player turn
			System.out.println("The computer scored " + cturn + " points this turn.");
			System.out.println("The computer has scored " + csum + " this game.");
			System.out.println("___________________________________________________________________");
				
			cturn = 0; //reset cpu turn total
					
		}		
	}
	
	if (psum >= 100)
	{
    System.out.println("CONGRATULATIONS! YOU WIN! Your final score was " + psum);
	}

	else if (csum >= 100)
	{
    System.out.println("Sorry, you lost! The final score was You: " + psum + "Computer: " + csum);
	}
		
	}
}