import java.util.Scanner;

public class Ch3Ex6
{
	public static void main(String[] argv)
	{	
	while (true)
		{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the initial size of the green crud population?");
		float size = input.nextFloat();
		System.out.println("How many days will it have to populate?");
		int time = input.nextInt();
		//only multiplies in 5 day increments, and remainder doesn't matter
		time = time/5;
		
		System.out.println(time);
		
		//create array of size time (first 2 are initial size)
		float[] arr = new float[time+1];
		arr[0] = size;
		arr[1] = size;
		
		//add previous 2 for each additional time
		for (int i = 2; i <= time; ++i )
		{
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		//display final total
		float total = arr[time];
		System.out.println("Total size: " + total);
		System.out.println("");	
		
		System.out.println("Calulcate again? (Press any key, or press 1 to exit.)");
		int re = input.nextInt();
		if (re == 1)
		{
			break;
		}		
		}
			
	}
}