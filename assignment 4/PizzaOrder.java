 public class PizzaOrder
{
	private int numPizzas;
	private Pizza p1;
	private Pizza p2;
	private Pizza p3;
	
	//DEFAULT CONSTRUCTOR
	public PizzaOrder()
	{
		numPizzas = 0;
		p1 = null;
		p2 = null;
		p3 = null;
	}
	
	//OVERLOADED CONSTRUCTOR
	public PizzaOrder(int n, Pizza piz1, Pizza piz2, Pizza piz3)
	{
		numPizzas = n;
		p1 = piz1;
		p2 = piz2;
		p3 = piz3;
	}
	
	public void setNumPizzas(int num)
	{
		if (num < 4)
		{
			numPizzas = num;
		}
	}
	
	public int getNumPizzas(PizzaOrder o)
	{
		return numPizzas;
	}
	
	public void setPizza1(Pizza pizza1)
	{
		p1 = pizza1;
	}
	
	public void setPizza2(Pizza pizza2) 
	{
		p2 = pizza2;
	}
	
	public void setPizza3(Pizza pizza3)
	{
		p3 = pizza3;
	}
	
	public Pizza getP1(PizzaOrder o)
	{
		return p1;
	}
	
	public Pizza getP2(PizzaOrder o)
	{
		return p2;
	}
	
	public Pizza getP3(PizzaOrder o)
	{
		return p3;
	}
	
	public String getPizza1Description(PizzaOrder o)
	{
		Pizza p1 = getP1(o);
		return p1.getDescription(p1);
	}
	
	public String getPizza2Description(PizzaOrder o)
	{
		Pizza p2 = getP2(o);
		return p2.getDescription(p2);
	}
	
	public String getPizza3Description(PizzaOrder o)
	{
		Pizza p3 = getP3(o);
		return p2.getDescription(p3);
	}
	
	public double calcTotal(PizzaOrder o)
	{
		Pizza p1 = getP1(o);
		Pizza p2 = getP2(o);
		Pizza p3 = getP3(o);
		int numPizzas = getNumPizzas(o);
		
		if (numPizzas == 1)
		{
			return p1.calcCost(p1);
		}
		
		else if (numPizzas == 2)
		{
			return (p1.calcCost(p1) + p2.calcCost(p2));
		}
		
		else if (numPizzas == 3)
		{
			return (p1.calcCost(p1) + p2.calcCost(p2) + p3.calcCost(p3));
		}
		else
			return 0;
	}
}