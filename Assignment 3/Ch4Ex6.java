import java.util.Scanner;

public class Ch4Ex6
{
	public static void main(String[] argv)
	{	
		//Input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Quiz 1 score: ");
		int q1 = input.nextInt();
		System.out.print("Enter Quiz 2 score: ");
		int q2 = input.nextInt();
		System.out.print("Enter Quiz 3 score: ");
		int q3 = input.nextInt();
		System.out.print("Enter Midterm score: ");
		int m1 = input.nextInt();
		System.out.print("Enter Final exam score: ");
		int f1 = input.nextInt();
		
		//Create Record object
		Record grades = new Record(q1, q2, q3, m1, f1);
		
		//Print formatted info on Record object
		System.out.println(grades.toString());
	}
	
}