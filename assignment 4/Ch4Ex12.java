public class Ch4Ex12
{
	public static void main(String[] argv)
	{
		Pizza pizza1 = new Pizza("l", 1, 0, 1);
		Pizza pizza2 = new Pizza("m", 2, 2, 0);
		PizzaOrder order = new PizzaOrder();
		order.setNumPizzas(2); // 2 pizzas in the order
		order.setPizza1(pizza1); // Set first pizza
		order.setPizza2(pizza2); // Set second pizza
		double total = order.calcTotal(order); // Should be 18+20 = 38 
		System.out.println(total);
	}
}