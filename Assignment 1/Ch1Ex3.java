public class Ch1Ex3
{
	public static void main(String[] argv)
	{	
		String first = "tyler";
		String last = "andrews";
	
		System.out.println(first.substring(1,2).toUpperCase() + first.substring(2) + first.substring(0,1) + "ay");
		System.out.println(last.substring(1,2).toUpperCase() + last.substring(2) + last.substring(0,1) + "ay");
	}
}