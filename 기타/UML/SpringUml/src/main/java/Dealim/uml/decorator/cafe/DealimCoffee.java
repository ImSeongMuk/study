package Dealim.uml.decorator.cafe;

public class DealimCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage1 = new DarkRoast();
		Beverage beverage2 = new Espresso();
		Beverage beverage3 = new HouseBlend();
		Beverage beverage4 = new Decaf();
		
		
		//DarkRoast
		beverage1 = new Soy(beverage1);
		beverage1 = new Milk(beverage1); 
		beverage1 = new Soy(beverage1);
		beverage1 = new Whip(beverage1);
		// new Milk(beverage1);
		// new Mocha(beverage1);
		// new Soy(beverage1);
		// new Whip(beverage1);
		System.out.println(beverage1.getDescription());
		System.out.println(beverage1.cost());
		
		//Espresso
		beverage2 = new Soy(beverage2);
		
		System.out.println(beverage2.getDescription());
		System.out.println(beverage2.cost());
	}

}
