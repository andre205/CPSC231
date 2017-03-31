public class Patient extends Person
{
	Doctor primaryphysician;
	
	public Patient()
	{
		super();
		primaryphysician = null;
	}
	
	public Patient(String theName, Doctor pp)
	{
		super(theName);
		primaryphysician = pp;
	}
	
	public void setPrimaryphysician(Doctor p)
	{
		primaryphysician = p;
	}
	
	public Doctor getPrimaryphysician()
	{
		return primaryphysician;
	}
	
	public Patient(Patient pobj)
	{
		super(pobj);
		primaryphysician = pobj.getPrimaryphysician();
	}
	
	public String toString()
	{
		return super.toString() + "\nPrimary Physician: " + primaryphysician.getName();
	}
	
	public boolean equals(Patient p)
	{
		return (super.equals(p) && getPrimaryphysician() == p.getPrimaryphysician());
	}
}