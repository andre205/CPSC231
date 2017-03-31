import java.util.Scanner;

public class Ch3Ex7
{
	public static void main(String[] argv)
	{	
		//This one doesnt work right for some reason and I can't figure out why. 
	
		Scanner input = new Scanner(System.in);
		double x = 0;
		//factorial is never 0
		double fac = 1;
		double answer = 0;	
	
		while (true)
		{			
			System.out.println("Enter a number to calculate e^x");
			x = input.nextDouble();
				
			for (int n = 1; n <= 10; ++n)
			{
				for (int i = 0; i < n; ++i)
				{
					for (int j = 1; j <= i; ++j)
					{
						fac *= j;
					}				
					
				answer += ((x*i)/(fac));
				}				
			System.out.println("For n = " + n + " e^x = " + answer);
			}
			
			int n = 50;
			for (int i = 0; i < n; ++i)
				{
					for (int j = 1; j <= i; ++j)
					{
						fac *= j;
					}				
					
				answer += ((x*i)/(fac));
				}
			System.out.println("For n = 50, e^x = " + answer);
				
			
			n = 100;
			for (int i = 0; i < n; ++i)
				{
					for (int j = 1; j <= i; ++j)
					{
						fac *= j;
					}				
					
				answer += ((x*i)/(fac));	
				}	
			System.out.println("For n = 100, e^x = " + answer);
				
			
			System.out.println("Calulcate again? (Press any key, or press 1 to exit.)");
			int re = input.nextInt();
			if (re == 1)
			{
				break;
			}	
		}
	
	
	
	}
}