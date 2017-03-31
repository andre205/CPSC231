public class Person
{
	private String name;

	public Person()
	{
		name = "";
	}
	public Person(String theName)
	{
		name = theName;
	}
	public Person(Person theObject)
	{
		name = theObject.name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String theName)
	{
		name = theName;
	}
	public String toString()
	{
		return "Name: " + name;
	}
	public boolean equals(Person other)
	{
		return getName() == other.getName();
	}
}