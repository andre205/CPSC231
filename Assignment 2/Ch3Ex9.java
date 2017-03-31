import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch3Ex9
{
	public static void main(String[] argv)
	{	
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		
		System.out.println("How many excersizes to input?");
		int num = input.nextInt();
		double scoresum = 0;
		double totalsum = 0;
		double score = 0;
		double total = 0;

		//go through excesizes, and add scores to totals
		for (int i = 1; i <= num; ++i )
		{
			System.out.println("Score for excersize " + i + "?");
			score = input.nextInt();
			System.out.println("Total points for excersize " + i + "?");
			total = input.nextInt();
			
			scoresum += score;
			totalsum += total;		
		}
		//use format object for 2 decimals then display
		String percent = df.format((scoresum / totalsum) * 100);
		System.out.println("Your total is " + scoresum + " out of " + totalsum + ", or " + percent + "%");
	}
}