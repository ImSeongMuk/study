package Dealim.uml.decorator.cafe;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		// TODO Auto-generated constructor stub
		this.description = "HouseBlend";
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3000;
	}
}
