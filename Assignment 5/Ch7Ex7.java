public class Ch7Ex7
{
	public static void main(String[] argv)
	{
		Date johndate = new Date(6, 6, 2015);
		Date jilldate = new Date(7, 7, 2014);		
		Doctor doctorjohn = new Doctor("John Jacob", johndate, 70000, "Pediatrician", 19.99);
		Doctor doctorjill = new Doctor("Jill Johnson", jilldate, 90000, "Family Doctor", 19.99);
		
		Patient adam = new Patient("Adam", doctorjohn);
		Patient lily = new Patient("Lily", doctorjohn);
		
		Billing b1 = new Billing(adam, doctorjohn, 195.50);
		Billing b2 = new Billing(lily, doctorjill, 395.99);
		
		System.out.println(adam.toString());
		System.out.println(lily.toString());
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		double billingtotal = b1.getAmountdue() + b2.getAmountdue();
		System.out.println("Total of billings: " + billingtotal);	
	}
}