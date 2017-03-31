public class File extends Document
{
	private String pathname;
	
	public File()
	{
		super();
		pathname = "";
	}
	
	public File(String p, String t)
	{
		super(t);
		pathname = p;
		
	}
	
	public void setPath(String p)
	{
		pathname = p;
	}
	
	public String getPath()
	{
		return pathname;
	}
	
	public String toString()
	{
		return "Path: " + pathname + "\n" + super.toString();
	}
}