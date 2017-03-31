import java.util.Scanner;

public class Ch2Ex5
{
	public static void main(String[] argv)
	{	
		float purchaseprice = 0;
		float salvagevalue = 0;
		float yearsused = 0;
		double deprec = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter purchase price: ");
		purchaseprice = input.nextFloat();	
		System.out.println("Enter expected salvage value: ");
		salvagevalue = input.nextFloat();	
		System.out.println("Enter expected years used: ");
		yearsused = input.nextFloat();	
		
		deprec = (purchaseprice - salvagevalue) / yearsused;
		System.out.println("The yearly depreciation is: " + deprec);
		
	}
}