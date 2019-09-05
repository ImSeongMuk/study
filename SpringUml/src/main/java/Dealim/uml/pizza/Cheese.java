package Dealim.uml.pizza;

public class Cheese extends Decorator{
	private SimplePizzs simplepizza;
	public Cheese(SimplePizzs simplepizza) {
		// TODO Auto-generated constructor stub
		this.simplepizza = simplepizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return simplepizza.description+",치즈";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return simplepizza.cost() +1500;
	}
}
