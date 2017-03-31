import java.util.Scanner;

public class Ch2Ex4
{
	public static void main(String[] argv)
	{	
		float distance = 0;
		float gasprice = 0;
		float mpg = 0;
		double cost = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter distance: ");
		distance = input.nextFloat();	
		
		System.out.println("Enter your car's gas mileage: ");
		mpg = input.nextFloat();
		
		System.out.println("Enter the price of 1 gallon of gas: ");
		gasprice = input.nextFloat();
		
		cost = (distance / mpg) * gasprice;
		System.out.println("The cost of the trip is: " + cost);
	}
}