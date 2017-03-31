public class Pizza
{
	private String size;
	private int numCheese;
	private int numPep;
	private int numHam;
	
	//DEFAULT CONSTRUCTOR
	public Pizza()
	{
		size = null;
		numCheese = 0;
		numPep = 0;
		numHam = 0;
	}
	
	//OVERLOADED CONSTRUCTOR
	public Pizza(String s, int c, int p, int h)
	{
		size = s;
		numCheese = c;
		numPep = p;
		numHam = h;
	}
	
	//GETTERS
	public String getSize()
	{
		return size;
	}
	
	public int getCheese()
	{
		return numCheese;
	}

	public int getPep()
	{
		return numPep;
	}
	
	public int getHam()
	{
		return numHam;
	}
	
	//SETTERS
	public void setSize(String s)
	{
		size = s;
	}
	
	public void setCheese(int c)
	{
		numCheese = c;
	}

	public void setPep(int p)
	{
		numPep = p;
	}
	
	public void setHam(int h)
	{
		numHam = h;
	}

	public double calcCost(Pizza p)
	{
		double cost = 0.0;
		if (p.getSize() == "small" || p.getSize() == "s")
		{
			cost = 10 + 2*(p.getCheese() + p.getPep() + p.getHam());
		}
		
		else if (p.getSize() == "medium" || p.getSize() == "m")
		{
			cost = 12 + 2*(p.getCheese() + p.getPep() + p.getHam());
		}
		
		else if (p.getSize() == "large" || p.getSize() == "l")
		{
			cost = 14 + 2*(p.getCheese() + p.getPep() + p.getHam());
		}

		return cost;
	}
	
	public String getDescription(Pizza p)
	{
		return "test";
		//return ("Size: " + p.getSize + "   |   Cheese Toppings: " + p.getCheese() + "   |   Pepperoni Toppings: " + p.getPep() + "   |   Ham Toppings: " + p.getHam() + "   |   Total Cost: " + p.calcCost());
	}
}