package Dealim.uml.decorator.cafe;

public class Soy extends CondimentDecorator{
	
	private Beverage beverage;
	 
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",두유";
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+400;
	}
}
