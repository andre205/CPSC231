import java.util.Scanner;

public class Ch2Ex2
{
	public static void main(String[] argv)
	{	
		String first = "";
		String last = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		first = input.nextLine();
		first = first.toLowerCase();
		
		System.out.println("Enter your last name: ");
		last = input.nextLine();
		last = last.toLowerCase();
		
		System.out.println(first.substring(1,2).toUpperCase() + first.substring(2) + first.substring(0,1) + "ay");
		System.out.println(last.substring(1,2).toUpperCase() + last.substring(2) + last.substring(0,1) + "ay");	
	}
}