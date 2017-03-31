import java.util.Scanner;

public class Ch2Ex10
{
	public static void main(String[] argv)
	{	
		String item1 = "";
		String item2 = "";
		String item3 = "";
		int quant1 = 0;
		int quant2 = 0;
		int quant3 = 0;
		float price1 = 0;
		float price2 = 0;
		float price3 = 0;
		float cost1 = 0;
		float cost2 = 0;
		float cost3 = 0;
		double taxtotal = 0;
		double total = 0;
		double finaltotal = 0;
		double taxrate = .0625;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the name of item 1: ");
		item1 = input.nextLine();
		System.out.println("Enter the quantity of item 1: ");
		quant1 = input.nextInt();
		System.out.println("Enter the price of item 1: ");
		price1 = input.nextFloat();
		
		System.out.println("Enter the name of item 2: ");
		item2 = input.next();
		System.out.println("Enter the quantity of item 2: ");
		quant2 = input.nextInt();
		System.out.println("Enter the price of item 2: ");
		price2 = input.nextFloat();
		
		System.out.println("Enter the name of item 3: ");
		item3 = input.next();
		System.out.println("Enter the quantity of item 3: ");
		quant3 = input.nextInt();
		System.out.println("Enter the price of item 3: ");
		price3 = input.nextFloat();
		
		cost1 = quant1 * price1;
		cost2 = quant2 * price2;
		cost3 = quant3 * price3;
		total = cost1 + cost2 + cost3;
		taxtotal = total * taxrate; 
		finaltotal = total + taxtotal;
		
		System.out.printf("%30s", "Item");
		System.out.printf("%10s", "Quantity");
		System.out.printf("%10s", "Price");
		System.out.printf("%10s", "Total\n");
		System.out.printf("%30s", item1);
		System.out.printf("%10d", quant1);
		System.out.printf("%10.2f", price1);
		System.out.printf("%10.2f", cost1);
		System.out.println();
		System.out.printf("%30s", item2);
		System.out.printf("%10d", quant2);
		System.out.printf("%10.2f", price2);
		System.out.printf("%10.2f", cost2);
		System.out.println();
		System.out.printf("%30s", item3);
		System.out.printf("%10d", quant3);
		System.out.printf("%10.2f", price3);
		System.out.printf("%10.2f", cost3);
		System.out.println();
		System.out.printf("%50s", "Subtotal");
		System.out.printf("%10.2f", total); 
		System.out.println();
		System.out.printf("%50s", "6.25 sales tax");
		System.out.printf("%10.2f", taxtotal); 
		System.out.println();
		System.out.printf("%50s", "Total");
		System.out.printf("%10.2f", finaltotal);
	}
}