public class Email extends Document
{
	private String sender;
	private String recipient;
	private String title;
	
	public Email()
	{
		super();
		sender = "";
		recipient = "";
		title = "";
	}
	
	public Email(String s, String r, String t, String text)
	{
		super(text);
		sender = s;
		recipient = r;
		title = t;
		
	}
	
	public void setSender(String s)
	{
		sender = s;
	}
	
	public void setRecipient(String r)
	{
		recipient = r;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public String getSender()
	{
		return sender;
	}
	
	public String getRecipient()
	{
		return recipient;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String toString()
	{
		return "Sender: " + sender + "\nRecipient: " + recipient + "\n Title: " + title + "\n" + super.toString();
	}
}