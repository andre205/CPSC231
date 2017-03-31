import java.util.Scanner;

public class Ch3Ex4
{
	public static void main(String[] argv)
	{	
		float cost = 0.0f;
		float rate = 0.0f;
		int time = 0;
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the cost of the item: ");
		cost = input.nextFloat();
		System.out.println("Enter the inflation rate: ");
		rate = input.nextFloat();
		System.out.println("Enter the time: ");
		time = input.nextInt();
				
		//adjust for inflation each year
		for (int i = 0; i < time; ++i)
		{
			cost = (cost * (1 + (rate/100)));
		}
				
		System.out.println("The cost would be: " + cost);		
	}
}