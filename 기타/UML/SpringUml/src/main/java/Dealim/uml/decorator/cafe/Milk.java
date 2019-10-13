package Dealim.uml.decorator.cafe;

public class Milk extends CondimentDecorator{
	
	private Beverage beverage;
	 
	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",우유";
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+500;
	}
}
