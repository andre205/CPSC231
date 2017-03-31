import java.util.Scanner;

public class Ch3Ex3
{
	public static void main(String[] argv)
	{	
		Scanner input = new Scanner(System.in);
	
		while(true)
		{
			//VARIABLES AND ASSIGNMENT
			int mheight;
			int fheight;
			int cheight = 0;
			int cfeet = 0;
			int cinches = 0;
			
			System.out.println("Enter the gender of the child (1 for Male, 2 for Female): ");
			int gen = input.nextInt();
			
			System.out.println("Enter the height of the mother: ");
			System.out.println("Feet: ");
			int mfeet = input.nextInt();
			System.out.println("Inches: ");
			int minch = input.nextInt();
			
			System.out.println("Enter the height of the father: ");
			System.out.println("Feet: ");
			int ffeet = input.nextInt();
			System.out.println("Inches: ");
			int finch = input.nextInt();
			
			mheight = minch + (mfeet * 12);
			fheight = finch + (ffeet * 12);
			
			
			//If male, male formula
			if (gen == 1)
			{
				cheight = (((mheight * 13/12) + fheight)/2);			
			}
			
			//female formula
			else if (gen == 2)
			{
				cheight = (((fheight * 12/13) + mheight)/2);
			}
			
			else
			{
				System.out.println("ERROR");
			}

			//Convert inch height to feet and inches and display
			cfeet = cheight / 12;
			cinches = cheight % 12;
			
			System.out.println("The child will be " + cfeet + " feet and " + cinches + " inches tall.");
			
			//Ask to continue
			System.out.println("Continue? Type 1 to exit, press enter to continue");
			int con = input.nextInt();
			if (con == 1)
			{
				break;
			}	
		}
		
		
		
	}
}