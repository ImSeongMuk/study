package Dealim.uml.decorator.cafe;

public class Mocha extends CondimentDecorator{
	
	private Beverage beverage;
	 
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",모카";
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+200;
	}
}
