import java.util.Scanner;

public class Ch2Ex8
{
	public static void main(String[] argv)
	{	
		String text = "";
		Scanner input = new Scanner(System.in);

		text = input.nextLine();
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
	}
}