package Dealim.uml.decorator.cafe;

public class DarkRoast extends Beverage{
	public DarkRoast() {
		// TODO Auto-generated constructor stub
		this.description = "DarkRoast";
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 3200;
	}
}
