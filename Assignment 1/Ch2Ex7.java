import java.util.Scanner;

public class Ch2Ex7
{
	public static void main(String[] argv)
	{	
		int price = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter price of item in cents (from 25 cents to a dollar, in 5-cent increments): ");
		price = 100 - input.nextInt();
		
		
		quarters = price/25;
		System.out.println("Quarters: " + quarters);
		price = price - (quarters * 25);
		
		dimes = price/10;
		System.out.println("Dimes: " + dimes);
		price = price - (dimes * 10);
		
		nickels = price/5;
		System.out.println("Nickels: " + nickels);	
	}
}