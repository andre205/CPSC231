public class Ch7Ex2
{
	public static void main(String[] argv)
	{
		Document[] myarray = new Document[5];
		myarray[0] = new Email("bob", "jane", "meeting on friday", "hey jane come to the meeting");
		myarray[1] = new Email("jane", "bob", "meeting on friday", "alright bob, I'll be at the meeting");
		myarray[2] = new Email("tim", "tom", "names", "hey tom, our names are only one letter off");
		myarray[3] = new File("C:/Documents", "this file contains the");
		myarray[4] = new File("C:/Documents/filefolder", "the content");
		
		for (int i = 0; i < 5; ++i)
		{
			System.out.println(ContainsKeyword(myarray[i], "the"));
		}
	}
	
	public static boolean ContainsKeyword(Document docObject, String keyword)
	{
	if (docObject.toString().indexOf(keyword,0) >= 0)
		return true;
	return false ;
	}
}