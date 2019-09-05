package Dealim.uml.pizza;

public class Bacon extends Decorator{
	private SimplePizzs simplepizza;
	public Bacon(SimplePizzs simplepizza) {
		// TODO Auto-generated constructor stub
		this.simplepizza = simplepizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return simplepizza.description+",베이컨";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return simplepizza.cost() +1200;
	}
}
