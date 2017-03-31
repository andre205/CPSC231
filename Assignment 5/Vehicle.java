public class Vehicle
{
	String manufacturer;
	int cylinders;
	Person owner;
	
	public Vehicle()
	{
		manufacturer = "";
		cylinders = 0;
		owner = null;		
	}
	
	public Vehicle(String m, int c, Person p)
	{
		manufacturer = m;
		cylinders = c;
		owner = p;
	}
	
	public Vehicle(Vehicle vobj)
	{
		manufacturer = vobj.getManufacturer();
		cylinders = vobj.getCylinders();
		owner = vobj.getOwner();
	}
	
	public void setManufacturer(String m)
	{
		manufacturer = m;
	}
	
	public void setCylinders(int c)
	{
		cylinders = c;
	}
	
	public void setOwner(Person p)
	{
		owner = p;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public int getCylinders()
	{
		return cylinders;
	}
	
	public Person getOwner()
	{
		return owner;
	}
	
	public String toString()
	{
		return "Manufacturer: " + manufacturer + "\nCylinders: " + cylinders + "\nOwner: " + owner.getName();
	}
	
	public boolean equals(Vehicle v)
	{
		return (getManufacturer() == v.getManufacturer() && getCylinders() == v.getCylinders() && getOwner() == v.getOwner());
	}
}