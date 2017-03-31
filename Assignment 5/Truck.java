public class Truck extends Vehicle
{
	double loadcapacity;
	int towcapacity;

	public Truck()
	{
		super();
		loadcapacity = 0;
		towcapacity = 0;
	}
	
	public Truck(String m, int c, Person p, double lc, int tc)
	{
		super(m,c,p);
		loadcapacity = lc;
		towcapacity = tc;
	}
	
	public Truck(Truck tobj)
	{
		super(tobj);
		loadcapacity = tobj.getLoadcapacity();
		towcapacity = tobj.getTowcapacity();
	}
	
	public void setLoadcapacity(double lc)
	{
		loadcapacity = lc;
	}
	
	public void setTowcapacity(int tc)
	{
		towcapacity = tc;
	}
	
	public double getLoadcapacity()
	{
		return loadcapacity;
	}
	
	public int getTowcapacity()
	{
		return towcapacity;
	}
	
	public String toString()
	{
		return super.toString() + "\nLoad Capacity: " + loadcapacity + "\nTow Capacity: " + towcapacity;
	}
	
	public boolean equals(Truck t)
	{
		return (super.equals(t) && getLoadcapacity() == t.getLoadcapacity() && getTowcapacity() == t.getTowcapacity());
	}
}