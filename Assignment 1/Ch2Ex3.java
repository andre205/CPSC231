import java.util.Scanner;

public class Ch2Ex3
{
	public static void main(String[] argv)
	{	
		int first = 0;
		int second = 0;
		int sum = 0;
		int diff = 0;
		int prod = 0;
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		first = input.nextInt();
				
		System.out.println("Enter your second number: ");
		second = input.nextInt();
		
		sum = first + second;
		diff = first - second;
		prod = first * second;
	
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + prod);		
	}
}