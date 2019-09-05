package Dealim.uml.pizza;


public class DealimPizza {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BulgogiPizza bulgogiPizza = new BulgogiPizza();
		CheesePizza cheesePizza = new CheesePizza();
		SweetpotatoPizza sweetpotatoPizza = new SweetpotatoPizza();
		
		
		Bacon bacon = new Bacon(bulgogiPizza);
		Salami salami = new Salami(bacon);
		Cheese cheese = new Cheese(salami);
		
		
		System.out.println(cheese.getDescription());
		System.out.println(cheese.cost());
	}
}
