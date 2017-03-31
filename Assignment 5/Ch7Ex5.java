public class Ch7Ex5
{
	public static void main(String[] argv)
	{
		Date johndate = new Date(6, 6, 2015);
		Date jilldate = new Date(7, 7, 2014);
		Doctor john = new Doctor("John Jacob", johndate, 70000, "Pediatrician", 19.99);
		Doctor jill = new Doctor("Jill Johnson", jilldate, 90000, "Family Doctor", 19.99);
		System.out.println(john.getSpecialty());
		System.out.println(john.getVisitfee());
		
		System.out.println(john.toString());
		System.out.println(jill.toString());
		
		System.out.println(john.equals(jill));
	}
}