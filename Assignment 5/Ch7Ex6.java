public class Ch7Ex6
{
	public static void main(String[] argv)
	{
		Person bob = new Person("bob");
		Vehicle civic = new Vehicle("Honda", 4, bob);
		Truck ram = new Truck("Dodge", 8, bob, 1400, 5);
		
		System.out.println(civic.toString());
		System.out.println(ram.toString());
		
		System.out.println(ram.equals(civic));
	}
}