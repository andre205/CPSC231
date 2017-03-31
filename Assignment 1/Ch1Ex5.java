public class Ch1Ex5
{
	public static void main(String[] argv)
	{	
		int index;
		String string = "I hate coding";
		String newString = null;
		
		index = string.indexOf("hate");
		newString = string.substring(0,index) + "love" + string.substring(index+4);
		
		System.out.println("The input line was \n" + string);
		System.out.println("It was changed to \n" + newString);
	
	}
}