public class Document
{
	private String text;
	
	public Document()
	{
		text = "";
	}
	
	public Document(String t)
	{
		text = t;
	}
	
	public String toString()
	{
		return text;
	}
	
	public void setText(String t)
	{
		text = t;
	}
}