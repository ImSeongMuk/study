package Dealim.uml.decorator.cafe;

public class Whip extends CondimentDecorator{
	
	private Beverage beverage;
	 
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",휘핑크림";
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+300;
	}
}
