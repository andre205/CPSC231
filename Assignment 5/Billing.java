public class Billing
{
	Patient patient;
	Doctor doctor;
	double amountdue;
	
	public Billing()
	{
		patient = null;
		doctor = null;
		amountdue = 0;
	}
	
	public Billing(Patient p, Doctor d, double a)
	{
		patient = p;
		doctor = d;
		amountdue = a;
	}
	
	public void setPatient(Patient p)
	{
		patient = p;
	}
	
	public void setDoctor(Doctor d)
	{
		doctor = d;
	}
	
	public void setAmountdue(double a)
	{
		amountdue = a;
	}
	
	public Patient getPatient()
	{
		return patient;
	}
	
	public Doctor getDoctor()
	{
		return doctor;
	}
	
	public double getAmountdue()
	{
		return amountdue;
	}
	
	public String toString()
	{
		return "Patient: " + patient.getName() + "\nDoctor: " + doctor.getName() + "\nAmount due: " + amountdue;
	}
	
	public boolean equals(Billing b)
	{
		return (getPatient() == b.getPatient() && getDoctor() == b.getDoctor() && getAmountdue() == b.getAmountdue());
	}
}