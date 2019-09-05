package Dealim.uml.pizza;

public class Salami extends Decorator{
	
	private SimplePizzs simplepizza;
	public Salami(SimplePizzs simplepizza) {
		// TODO Auto-generated constructor stub
		this.simplepizza = simplepizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return simplepizza.description+",살라미";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return simplepizza.cost()+1000;
	}

}
