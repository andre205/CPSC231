public class Doctor extends SalariedEmployee
{
	String specialty;
	double visitfee;
	
	public Doctor()
	{
		super( );
		specialty = "";
		visitfee = 0;
	}
	
	public Doctor(String theName, Date theDate, double theSalary, String spec, double vf)
	{
		super(theName, theDate, theSalary);
		specialty = spec;
		visitfee = vf;
	}
	
	public void setSpecialty(String s)
	{
		specialty = s;
	}
	
	public void setVisitfee(double v)
	{
		visitfee = v;
	}
	
	public String getSpecialty()
	{
		return specialty;
	}
	
	public double getVisitfee()
	{
		return visitfee;
	}
	
	public String toString( )
    {
        return super.toString() + "\n Specialty: " + specialty + "\nVisit Fee: " + visitfee;
    }

    public boolean equals(Doctor other)
    {
        return (super.equals(other) && getSpecialty() == other.getSpecialty() && getVisitfee() == other.getVisitfee());
    }
}